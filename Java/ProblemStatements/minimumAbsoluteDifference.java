package ProblemStatements;

import java.util.*;

public class minimumAbsoluteDifference {

     public static int minimumAbsoluteDifference(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    int minDiff = Math.abs(arr.get(0)-arr.get(1));
    int size = arr.size();
    
    for(int i=0;i<size-1;i++){
        int diff = Math.abs(arr.get(i)-arr.get(i+1));
        if(diff < minDiff){
            minDiff = diff;
        }
    }
    return minDiff;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an arraysize followed by array values");
        int size = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            int num = sc.nextInt();
            list.add(num);
        }
       int res = minimumAbsoluteDifference(list);
       System.out.println("minimumAbsoluteDifference = "+res);
    }
}
