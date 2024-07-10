package zoho;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class prac {
    public static void main(String[] args) {
        // int size =10;
        // for(int i=0;i<size;i++){
        //     System.out.println("for i :"+i);

        //     while(i+1<size){
        //         System.out.println("while :"+ ++i);
        //     }
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter an array size followed by array elements");
        // int arraySize = sc.nextInt();
        // int[] arr = new int[arraySize];

        // for(int i=0;i<arraySize;i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int val:arr){
        //     System.out.println(val);
        // }

        // System.out.println("Enter an String");
        // String str = sc.nextLine();
        // for(char val:str.toCharArray()){
        //     System.out.println(val);
        // }
        // sc.close();

        // int i = 0;
        // int val = (2 * i - 1);
        // System.out.println(val);


        // TreeSet<Integer> numbers = new TreeSet<>();

    // Add elements to the set
    // numbers.add(3);
    // numbers.add(9);
    // numbers.add(8);
    // numbers.add(1);

    // // Calculate the difference
    // int difference = 7 - 3;

    // // Find the ceiling element
    // Integer lowerBound = numbers.ceiling(difference);

    // System.out.println("Original Set: " + numbers);
    // System.out.println("Difference: " + difference);
    // System.out.println("Lower Bound (ceiling): " + lowerBound);

    int arr[] = {1,2,3,4};
    
    boolean isDuplicate = containsDuplicate(arr);
    System.out.println(isDuplicate);
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int n:nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
