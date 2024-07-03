package BasicJavaPrograms;
import java.util.ArrayList;
import java.util.Scanner;

public class diagDiffUsingArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0;i<rows;i++){
            arr.add(new ArrayList<>());
            for(int j=0;j<columns;j++){
                Integer element = scanner.nextInt();
                arr.get(i).add(element);
            }
        }
        System.out.println("arr = "+arr);

        long primaryDiagonalSum = 0,secDiagonalSum = 0;
        for(int i=0;i<rows;i++){
            primaryDiagonalSum = primaryDiagonalSum + arr.get(i).get(i);
            secDiagonalSum = secDiagonalSum + arr.get(i).get(rows-i-1);
        }
        long diff = primaryDiagonalSum - secDiagonalSum;
        System.out.println("primaryDiagonalSum = "+primaryDiagonalSum +"\n"+"secDiagonalSum = "+secDiagonalSum+"\n"+"Diff = "+ diff);
        scanner.close();
    }
}
