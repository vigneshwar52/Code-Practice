package MultiTasking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ExecutorFutureExample {

    public static void main(String[] args) throws InterruptedException {
        // Create a thread pool with 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submit a callable task that returns an Integer
        Future<Integer> futureTask = executorService.submit(new CallableTask(5));

        try {
            // Check if the task is done
            if (futureTask.isDone()) {
                System.out.println("Task is done.");
            } else {
                System.out.println("Task is still running.");
            }

            // Attempt to get the result with a timeout
            Integer result = futureTask.get(3, TimeUnit.SECONDS);
            System.out.println("Task completed with result: " + result);

        } catch (TimeoutException e) {
            System.out.println("Task did not complete within the timeout period.");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Check if the task was canceled
        if (futureTask.isCancelled()) {
            System.out.println("Task was canceled.");
        } else {
            System.out.println("Task was not canceled.");
        }

        // Cancel the task (if still running)
        boolean wasCanceled = futureTask.cancel(true);
        if (wasCanceled) {
            System.out.println("Task was successfully canceled.");
        }
        // Shut down the executor
        executorService.shutdown();
        System.out.println("shutdown the executor");
    }
}

class CallableTask implements Callable<Integer> {
    private int num;

    public CallableTask(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        // Simulate a long-running task
        Thread.sleep(2000);
        return num * num;
    }
}
