package ProblemStatements;
import java.util.Scanner;

public class palindromeIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an string");
        String str = sc.nextLine();

        int l = str.length();
        System.out.println("Str and length = "+str + l);
        sc.close();

        int resultIndex = PalindromeIndex(str,l);
        System.out.println("Final Index value = "+resultIndex);
    }

    private static int PalindromeIndex(String str, int len) {
        boolean result = isPalindrome(str);
        System.out.println("result = " + result);

        if(result){
            return -1;
        }else{
        for(int i=0;i<len/2;i++){
            if(str.charAt(i) != str.charAt(len-1-i)){
                if(i+1 < len){
                    boolean isPalindrome = isPalindrome(str.substring(i+1, len-i));
                    if(isPalindrome)
                    return i;
                    else
                    return len-i-1;
                }
            }
        }
    }
    return -1;
}
    private static boolean isPalindrome(String str){
        // StringBuilder builder = new StringBuilder(str);
        // String revStr = builder.reverse().toString();
        // System.out.println("revStr = "+revStr);
        // return str.equals(revStr);
        int l =str.length();
        for(int i=0;i<l/2;i++){
            if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(l-1-i))){
                return false;
            }
        }return true;
    }
    
}
