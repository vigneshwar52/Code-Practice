package zoho;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sortByFreq {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int length = sc.nextInt();int arr[] = new int[length];

        // System.out.println("Enter array elements");
        // for(int i=0;i<length;i++){
        //     arr[i] = sc.nextInt();
        // }

        int arr[] = {1,2,1,2,3,4,55,55};
        Map<Integer,Integer> map = new HashMap<>();
        for(int val:arr){
            map.put(val,map.getOrDefault(val,0)+1);
        }
    }
}
