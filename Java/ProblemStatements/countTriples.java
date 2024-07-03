package ProblemStatements;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countTriples {

    private static long countTriplets(long[] arr,int size,long r){
      long count = 0;

    //long is a primitive data type, meaning it represents a single numerical value and doesn't have any additional methods or functionalities.
    //Long is a wrapper class for long. It provides additional functionalities like converting between strings and numbers or checking if a value is null.
       Map<Long,Long> leftMap = new HashMap<>();
       Map<Long,Long> rightMap = new HashMap<>(); 

       for(long item:arr){
        rightMap.put(item,rightMap.getOrDefault(item, 0L));
       }
       for(int i=0;i<arr.length;i++){
        long midTerm = arr[i];
        long c1=0,c3=0;

        rightMap.put(midTerm,rightMap.getOrDefault(midTerm, 0L)-1);
        if(leftMap.containsKey(midTerm/r)&& midTerm%r == 0){
            c1 = leftMap.get(midTerm/r);
        }
        if(rightMap.containsKey(midTerm*r))
            c3 = rightMap.get(midTerm*r);
        count = count + c1+c3;

        leftMap.put(midTerm,leftMap.getOrDefault(midTerm, 0L)+1);
       }

        return count;
    }
    public static void main(String[] args) {
        
        int size = 10;long r = 3;
        long[] arr = new long[size];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<size;i++){
            arr[i] = in.nextLong();
        }System.out.println("\n");
        for(long val:arr){
            System.out.println(val);
        }

        long finalCount = countTriplets(arr,size,r);
        System.out.println("final count = "+finalCount);
        in.close();
    }
}
