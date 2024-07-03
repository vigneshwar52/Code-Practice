package BasicJavaPrograms;
import java.util.Scanner;

public class diagonalDifference {
    public static void main(String[] args) {
        int index = 3;
        int[][] arr = new int[index][index];
        Scanner in = new Scanner(System.in);
        
        for(int i=0;i<index;i++){
            for(int j=0;j<index;j++){
                System.out.println("Enter an array element for index "+"["+i+"]["+j+"]");
                arr[i][j] = in.nextInt();
            }
        }

        long primaryDiagonalSum = 0,secDiagonalSum = 0;
        for(int i=0;i<index;i++){
            primaryDiagonalSum = primaryDiagonalSum + arr[i][i];
            secDiagonalSum =secDiagonalSum + arr[i][index-i-1];
        }System.out.println("primaryDiagonalSum and secDiagonalSum are"+"\n"+primaryDiagonalSum+"\n"+secDiagonalSum+"\n");
        long diff = primaryDiagonalSum - secDiagonalSum;
        System.out.println("difference = "+diff);
        in.close();
    }
}
