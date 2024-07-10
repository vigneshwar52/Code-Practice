package zoho;

import java.util.HashSet;
import java.util.Set;

public class findDuplicate {

    public static void main(String[] args) {
    
        int arr[] = {1,2,3,4};
    
        boolean isDuplicate = containsDuplicate(arr);
        System.out.println(isDuplicate);

    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int n:nums){
            if(!set.add(n)){
                return true;
            }
        }
        return false;
    }
}
