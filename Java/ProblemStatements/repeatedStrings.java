package ProblemStatements;
import java.util.Scanner;

public class repeatedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an String Value");
        String val = sc.nextLine();
        System.out.println("Enter an total string length value : ");
        int n = sc.nextInt();
        System.out.println("Enter an char value");
        char character = sc.next().charAt(0);
        int repeatedTimes = repeatedString(val,n,character);

        System.out.println("Final count = "+repeatedTimes);
        sc.close();
    }

    private static int repeatedString(String str, int n,char character) {
        System.out.println("Entered Strings = "+str+"\n"+"size of the entire string = "+n +"\n"+"Enter an repeated charcters to be found = "+character);
        int size = str.length();
        int q,r;
        q = n/size;
        r = n%size;
        System.out.println("Size = "+size+"\n"+"q = "+q+"\n"+"r = "+r+"\n"+"n = "+n+"\n");
        
        int remainingCharCount =  (q == 0) ? 0 : noOfRepeatedChar(str, size, character);
        int modCharCount = (r == 0) ? 0 : noOfRepeatedChar(str, r, character);

        System.out.println("remainingCharCount = "+remainingCharCount+"  modCharCoun = "+modCharCount);

         return modCharCount +remainingCharCount;
    }

    private static int noOfRepeatedChar(String str, int size,char character) {
        int count=0;
        for(int i=0;i<size;i++){
            if(str.charAt(i)==character){
                count++;
            }
        }
      return count;
    }
}