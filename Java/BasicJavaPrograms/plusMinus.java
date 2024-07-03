package BasicJavaPrograms;
import java.util.ArrayList;
import java.util.Scanner;

public class plusMinus {
    public static void main(String[] args) {
        int size;
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(size);

        for(int i=0;i<size;i++){
            int num = in.nextInt();
            list.add(num);
        }
        int pos,neg,zero;
        pos = neg = zero = 0;
        for(int num:list){
          if(num>0){
            pos++;
          }else if(num <0){
            neg++;
          }else
            zero++;
        }
        System.out.println((float)pos/list.size());
        System.out.println((float)neg/list.size());
        System.out.println((float)zero/list.size());
        in.close();
    }
}
