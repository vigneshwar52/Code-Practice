package ProblemStatements;

import java.util.Arrays;

// minimum difference between the largest and smallest value By Three Moves
public class minDifferenceByMoves {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,5,6,7,9,11,14,33,322,454};
        int result = minDifference(arr);
        System.out.println(result);
    }

    public static int minDifference(int[] nums) {
        int n = nums.length;
        if(n<=4){
            return 0;
        }
        Arrays.sort(nums);
        int ans = nums[n-1]-nums[0];
       for(int i=0;i<=3;i++){
        ans = Math.min(ans,nums[n -i-1]-nums[i]);
       }
       return ans;
    }
}