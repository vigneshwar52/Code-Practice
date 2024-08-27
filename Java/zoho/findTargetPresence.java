package zoho;

import java.util.Arrays;

public class findTargetPresence {
    public static void main(String[] args) {
         // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int arr[] = new int[size];

        int arr[] = { 1 , 2 , 3 , 4 , 5 , 5};
        int n = arr.length;
        int Target = 1;
        boolean isPresent = isTargetAvailable(arr,n,Target);
        System.out.println("isPresent = "+isPresent);
    }

    private static boolean isTargetAvailable(int[] arr, int n, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        while (left<=right) {
            int mid = (left+right)/2;
            if(target == arr[mid]){
                return true;
            }
            else if(target>arr[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
}
