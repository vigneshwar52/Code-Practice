package ProblemStatements;

import java.util.Arrays;

public class removeElement {

    public static class ArrayAndValue{
        private int[] array;
        private int value;

        public ArrayAndValue(int[] array, int value) {
            this.array = array;
            this.value = value;
        }
    
        public ArrayAndValue() {
        }

        public int[] getArray() {
            return array;
        }

        public int getValue() {
            return value;
        }

        public void setArray(int[] array) {
            this.array = array;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }


    public static int[] removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index] = nums[i];
                index++;
            }
        }return Arrays.copyOf(nums, index);
    }


    public static void main(String[] args) {
        int arr[] = {0,1,2,2,3,0,4,2};
        int val = 2;int newLength = 0;
        int[] result = removeElement(arr, val);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                newLength++;
            }
        }

        ArrayAndValue values = new ArrayAndValue();
        values.setArray(result);
        values.setValue(newLength);

       // for(int i=0;i<newLength;i++){
            System.out.println(Arrays.toString(values.getArray()));
       // }
    }
}
