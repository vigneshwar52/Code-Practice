package Fidelity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class minSwaps {
   public static int minimumSwaps(int[] arr) {
       int n = arr.length;
       int[] sortedArr = arr.clone();
       Arrays.sort(sortedArr);
       Map<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
       
       for(int i=0;i<n;i++){
        indexMap.put(arr[i], i);
       }
       boolean visited[] = new boolean[n];
       int swaps = 0;

       for(int i=0;i<n;i++){
        if(visited[i]||arr[i] == sortedArr[i]){
            continue;
        }
        int cycleLength = 0;
        int current = i;
        
        while(!visited[current]){
            visited[current] = true;
            current = indexMap.get(sortedArr[current]);
                cycleLength++;
            }
            
            // If a cycle of length L is found, it takes L-1 swaps to sort it
            if (cycleLength > 0) {
                swaps += (cycleLength - 1);
            }
       }
    return swaps;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(minimumSwaps(arr));
        sc.close();
    }
}
