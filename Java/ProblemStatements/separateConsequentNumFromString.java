package ProblemStatements;

import java.util.Scanner;

public class separateConsequentNumFromString {
    private static char separateNum(String val){
        int length = val.length();

        for(int i=0;i<length;i++){
            if(val.charAt(i+1)-val.charAt(i) == 1){
                return val.charAt(i);
            }else{

            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String val;
        Scanner in =new Scanner(System.in);
        val = in.nextLine();

        char digit = separateNum(val);
        System.out.println("yes "+digit);
        in.close();
    }
}
