package zoho;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class freqLimitedArrayElements {
    public static void main(String[] args) {
        int arr[] = {3,11,12,3,4};
        int n=5,p=5;
        frequencyCount(arr,n,p);
    }
    // public static void frequencyCount(int arr[], int n, int p)
    // {
    //   int freq[] = new int[n];
    //     for(int i=0;i<n;i++){
    //         if(arr[i]>0 && arr[i]<=n){
    //             freq[arr[i]-1]++; 
    //         }
    //     }
    //    System.out.println(Arrays.toString(freq));
    // }
    public static void frequencyCount(int arr[], int N, int P)
    {
        //N - size
        //P - position
        int[] freq = new int[N];
        if(N>=P){
        for(int i=0;i<P;i++){
            if(arr[i]>0 && arr[i]<=N){
                freq[arr[i]-1]++;
            }
         }
        }
        System.out.println(Arrays.toString(freq));
    }
    
}
