package ProblemStatements;

import java.util.Scanner;

public class caeserCipherEncryption {

    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            if(Character.isLetter(c)){
                char base = Character.isLowerCase(c)?'a':'A';
                
                char shift = (char)((c - base + k)%26 + base);
                result.append(shift);
            }else{
                result.append(c);
            }
        }
        return result.toString();
    
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an string followed by shift key value");
        String str = sc.nextLine();
        int key = sc.nextInt();

       String result = caesarCipher(str,key);
       System.out.println("Encrypted Code = "+result);
    }
}
