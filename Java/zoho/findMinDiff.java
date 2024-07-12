package zoho;

import java.util.Arrays;
import java.util.Scanner;


public class findMinDiff {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int minDifference = mindiff(arr);
    System.out.println("min Diff");
    System.out.print(minDifference);
    System.out.println();
System.out.println("Sorted one after calling mindiff");
    for(int num:arr){
    System.out.print(num);
    }
    System.out.println();
    System.out.println("result");
    for(int i=0;i<n-1;i++){
        if(arr[i+1]-arr[i] == minDifference){
            System.out.print(arr[i]+" "+arr[i+1]+" ");
        }
    }
}
public static int mindiff(int arr[]){
    Arrays.sort(arr);
    int min = Integer.MAX_VALUE;
    for(int i=0;i<arr.length-1;i++){
        int adjDiff = arr[i+1]-arr[i];
        if(adjDiff < min){
            min = adjDiff;
        }
    }
    return min;
 }
}
