package zoho;

import java.util.Scanner;

public class num2bin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dec = s.nextInt();

        if(dec == 0){
            System.out.println("0");
            return;
        }
        int bin[] = new int[32];int i=0;
        while(dec>0){
            bin[i] = dec%2;
            dec = dec/2;
            i++;
        }
        // System.out.println(Arrays.toString(bin));
        for(int j=i-1;j>=0;j--){
            System.out.print(bin[j]);
        }
    }
}
