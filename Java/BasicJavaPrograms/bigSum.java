package BasicJavaPrograms;
import java.util.Scanner;

public class bigSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=in.nextLong();
        }
        System.out.println("Total = "+sum);
        in.close();
    }    
}
