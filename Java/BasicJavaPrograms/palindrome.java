package BasicJavaPrograms;
import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome == true ?"Entered String is an palindrome":"not an palindrome");

        boolean isIntPalindrome = intPalindrome(101);

        System.out.println(isIntPalindrome == true ?"Entered Integer is an palindrome":"Int not an palindrome");
        sc.close();
    }

    //using inbuild method

    // public static boolean palindrome(String str){
    //     StringBuilder sb = new StringBuilder(str);
    //     String revStr = sb.reverse().toString();

    //     return revStr.equals(str);
    // }
    
    //using custom one
    
    private static boolean intPalindrome(int num) {
        int result = 0;
        int original = num;
        while (num>0) {
            result =(result*10) + num%10;
            num = num/10;
        }System.out.println("Result :"+result);
        return result == original ? true :false ;
    }

    private static boolean isPalindrome(String str) {
        int l = str.length();
        for(int i=0;i<l/2;i++){
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(l-1-i))){
                return false;
            }
        }
        return true;
    }
}
