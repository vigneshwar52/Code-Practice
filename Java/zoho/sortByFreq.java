package zoho;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class sortByFreq {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int length = sc.nextInt();int arr[] = new int[length];

        // System.out.println("Enter array elements");
        // for(int i=0;i<length;i++){
        //     arr[i] = sc.nextInt();
        // }

        int arr[] = {1,2,1,2,3,4,55,55};
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int val:arr){
        //     map.put(val,map.getOrDefault(val,0)+1);
        // }
        // System.out.println(map.size());

        class Solution {
            public static int doUnion(int arr1[], int arr2[]) {
                // Your code here
                Map<Integer,Integer> map = new HashMap<>();
                
                for(int num1:arr1){
                    map.put(num1,map.getOrDefault(map,0)+1);
                }
                 
                 for(int num1:arr2){
                    map.put(num1,map.getOrDefault(map,0)+1);
                }
                
                return map.size();
        
                Set<Integer> set = new HashSet<>();
                for(int num1:arr1){
                    set.add(num1);
                }
                 
                 for(int num1:arr2){
                    set.add(num1);
                }
            }
        }
    }
}
