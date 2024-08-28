package Fidelity;

import java.util.Scanner;

/*
 * Mr X is a teacher of maths. He came across a very simple problem. In the problem you have to arrange the numbers in an ascending order and calculate the total number of swaps required. The number of swaps must be minimum. But Mr X is busy with some other tasks and you being his favourite student , so he asks you to solve this problem.

Constraints:
1<=T<=100
1<=N<=100
1<=A[ ] <=1000
Examples

Input :
4
4 3 1 2
Output:
2
Explanation: Swap index 0 with 3 and 1 with 2 to form the sorted array {1, 2, 3, 4}.
 */

public class RangeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        int n = sc.nextInt();
        int[] array = new int[n];
        
        // Read the array elements
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        // Read the number of queries
        int numQueries = sc.nextInt();
        int result[] = new int[numQueries];
        
        // Process each query
        for (int q = 0; q < numQueries; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            result[q] = countInRange(array, i, j);
        }
        for(int i=0;i<numQueries;i++){
            int query = i+1;
            System.out.println(query+":"+result[i]);
        }
        sc.close();
    }
    
    // Function to count elements in the given range [i, j]
    private static int countInRange(int[] array, int i, int j) {
        int count = 0;
        for (int num : array) {
            if (num >= i && num <= j) {
                count++;
            }
        }
        return count;
    }
}
