import java.sql.Array;
import java.util.Arrays;

public class printNonPalindrome {
    public static void main(String[] args) {
        String str = "he knows malayalam";
        String[] strArray = str.split(" ");

        // System.out.println(Arrays.toString(strArray));

        for(String word:strArray){
        boolean val = printString(word);
            if(!val && strArray.length == 1){
                System.out.print(word);
            }else if(!val){
                System.out.print(" "+word);
            }
        }
    }

    public static Boolean printString(String str){
        int length = str.length();
        while(length>0){
            if(str.charAt(0) !=str.charAt(str.length()-1)){
                return false;
            }length++;
        }
        return true;
    }
}
