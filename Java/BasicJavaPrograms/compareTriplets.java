package BasicJavaPrograms;
import java.util.Scanner;

public class compareTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size =3;
        int[] a = new int[size];
        int b[] = new int[size];
        int alice=0,bob=0;

        for(int i=0;i<size;i++){
            a[i] = in.nextInt();
        }
        for(int i=0;i<size;i++){
            b[i] = in.nextInt();
        } 
        for(int i =0;i<size;i++){
            if(a[i]>b[i]){
                alice++;
            }else if(b[i]>a[i]){
                bob++;
            }
        }
        System.out.println("counts for alice and bob are "+alice +" "+bob);
        in.close();
    }
}
