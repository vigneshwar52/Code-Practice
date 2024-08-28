package Fidelity;

import java.util.Scanner;

public class permutations {

    
    private static void printPermutations(String str) {
        permute(str,0,str.length()-1);
    }

    private static void permute(String str, int left, int right) {
        if(left == right){
            System.out.println(str);
        }else {
            for(int i=left;i<=right;i++){
                str = swap(str,left,i);
                permute(str, left+1, right);
                str = swap(str,left,i);
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char charArray[] = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printPermutations(str);
    }
}
