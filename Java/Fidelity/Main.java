package Fidelity;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of elements in the array
        int[] arr = new int[n]; // Initialize the array
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read each element of the array
        }
        
        System.out.println(minimumSwaps(arr)); // Output the result
        sc.close();
    }

    private static int minimumSwaps(int[] arr) {
        int n = arr.length;
        int swaps = 0;

        // Create a boolean array to check if elements are visited
        boolean[] visited = new boolean[n];
        
        // Create an array of pairs where each pair is (element, original_index)
        List<Pair> arrPos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrPos.add(new Pair(arr[i], i));
        }

        // Sort the array by element values
        Collections.sort(arrPos, Comparator.comparingInt(p -> p.value));
        
        // Loop through sorted pairs and determine cycles
        for (int i = 0; i < n; i++) {
            // Already sorted or visited element
            if (visited[i] || arrPos.get(i).index == i) {
                continue;
            }

            // Calculate the size of the cycle
            int cycleLength = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = arrPos.get(j).index;
                cycleLength++;
            }

            // If there is a cycle of n elements, we need (n - 1) swaps
            if (cycleLength > 0) {
                swaps += (cycleLength - 1);
            }
        }
        
        return swaps;
    }

    // Helper class to store array value and its original index
    static class Pair {
        int value, index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
