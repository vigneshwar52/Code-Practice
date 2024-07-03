package BasicJavaPrograms;
import java.util.ArrayList;
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter an array size");
        int index = sc.nextInt();
        System.out.println("enter an array value");
        for(int i=0;i<index;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("entered list = "+list);
        System.out.println("\n");

        sumMinMax(list,index);
        sc.close();
    }

    private static void sumMinMax(ArrayList<Integer> list, int index) {
        long sum = 0;
        int min,max;
        min = list.get(0);
        max = list.get(0);

        for(int num:list){
            sum = sum + num;

            if(min>num) min = num;
            if(max<num) max = num;
        }System.out.println("sum value = "+sum);
        System.out.println("Minimum value = "+(sum-max));System.out.println("Maximum value = "+(sum-min));
    }
}
