package MultiTasking;

/**
 * Thread
 */
public class ThreadExample {
   public static class MyThread extends Thread {
    public void run() {
        for(int i=0;i<10;i++){
        System.out.println("Thread is running...");
        }
    }

        public static void main(String[] args) {
            MyThread thread = new MyThread();
            /*
             * run method won't create new thread instead it'll run on main thread
             * So, it'll execute as per the top to bottom order
             */

            // thread.run();

            /*
             * it'll create a new thread and register it in thread scheduler  
             * mostly this thread run followed by main thread so it'll execute next to main thread or won't block the main thread at any instant)
             */
            thread.start();
            for(int i=0;i<10;i++){
                System.out.println("Main Thread");
            }
        }
    }
}