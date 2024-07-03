package ProblemStatements;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class removeOutermostParanthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = "()())(()";

        //String res = removeOuterParanthesis(str);
        // char[] arr = str.toCharArray();
        // System.out.println("The final String is "+Arrays.toString(arr));

        String paragraph = "This is a lengthy paragraph that needs to be converted into an array of words.";
        
        // Split the paragraph into words using space as the delimiter
        String[] words = paragraph.split("\\s+");
        
        // // Print the array of words
        // for (String word : words) {
        //     System.out.println(word);
        // }

        System.out.println(Arrays.toString(words));
        sc.close();
    }

    private static String removeOuterParanthesis(String str) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for(char c:str.toCharArray()){
        if(c == '('){
            if(count > 0){
                result.append(c);
            }count++;
        }
        else if(c == ')'){
            count -- ;
            if(count > 0){
            result.append(c);
            }
        }
    }
        return result.toString();
    }
}