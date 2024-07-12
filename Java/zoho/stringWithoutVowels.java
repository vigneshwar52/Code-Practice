package zoho;

import java.util.Scanner;

public class stringWithoutVowels {

    public static Boolean isVowel(char c){
        char lowerc = Character.toLowerCase(c);
        return lowerc == 'a' || lowerc == 'e' || lowerc == 'i' || lowerc == 'o' || lowerc == 'u';
    }
    public static String removeVowels(String str){
        StringBuilder result = new StringBuilder();
        for(char ch:str.toCharArray()){
            if(!isVowel(ch)){
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.next();
        String result = removeVowels(input);

        System.out.println(result);
    }
}
