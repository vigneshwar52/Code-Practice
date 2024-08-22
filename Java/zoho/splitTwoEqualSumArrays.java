package zoho;

import java.util.Scanner;

public class splitTwoEqualSumArrays {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int arr[] = new int[size];

        int arr[] = { 1 , 2 , 3 , 4 , 5 , 5};
        int n = arr.length;
        int pos = splitEqualSum(arr,n);
        System.out.println("Position = "+pos);
    }

    public static int splitEqualSum(int arr[],int n){

        int leftSum = 0;
        for(int i=0;i<n;i++){
            leftSum =leftSum + arr[i];

            int rightSum = 0;
            for(int j=i+1;j<n;j++){
                rightSum = rightSum + arr[j];
            }
            if(leftSum == rightSum){
                return i+1;
            }
        }

        return -1;
    }
}
