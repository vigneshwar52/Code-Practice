package zoho;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an array size followed by array elements");
        int arraySize = sc.nextInt();
        int[] arr = new int[arraySize];

        for(int i=0;i<arraySize;i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for(int val:arr){
            if(val%2 == 0){
                evenList.add(val);
            }else{
                oddList.add(val);
            }
        }
        Collections.sort(evenList);
        Collections.sort(oddList,Collections.reverseOrder());

        int[] result = new int[arraySize];
        int z=0;
        for(int i=0;i<oddList.size();i++){
            result[i] = oddList.get(i);
        }for(int i=0;i<evenList.size();i++){
            result[oddList.size()+i] = evenList.get(i);
        }

        for(int num:result){
            System.out.println(num);
        }
    }

    // private static void sortDescendingOddList(ArrayList<Integer> oddList) {
    //     for(int i=0;i<oddList.size()/2;i++){
    //         int temp = oddList.get(i);
    //         oddList.add(i,oddList.get(oddList.size()-i-1));
    //         oddList.add(oddList.size()-i-1,temp);
    //     }
    // }
}
