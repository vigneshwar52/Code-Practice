package BasicJavaPrograms;
import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashMap {
    public static void main(String[] args) {
        // String str = "hello",revStr;
        // StringBuilder sb = new StringBuilder(str);
        // revStr = sb.reverse().toString();
        // System.out.println(revStr);

        int[] nums = { 12, 7, 2, 15 };
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(target>nums[i]){
            int compliment = target - nums[i];
                if(map.containsKey(compliment)){
                    return new int[] {map.get(compliment),i};
                }
                map.put(nums[i], i);
            }
        }
      
        throw new IllegalArgumentException("No two sum solution");
    }
}
