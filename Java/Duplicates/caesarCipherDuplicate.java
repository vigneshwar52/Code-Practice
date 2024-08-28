package Duplicates;

import java.util.Scanner;

public class caesarCipherDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter an String followed by an encryption Key");
        String str = sc.nextLine();
        int key = sc.nextInt();

        char ch[] = new char[str.length()]; 
        for(int i=0;i<str.length();i++){
         ch[i] = getEncryptedString(str.charAt(i),key,i,str.length());
         sb.append(ch[i]);
        }
        System.out.println(sb.toString());
    }

    private static char getEncryptedString(char letter, int key,int currentIndex,int size) {
        char base = Character.isLowerCase(letter)?'a':'A';
        char encrypChar = (char)((letter-base)%26+base + key);

        

        // char encryptArray[] = new char[size];

        // encryptArray[currentIndex] = encrypChar;
        return encrypChar;
    }

}
