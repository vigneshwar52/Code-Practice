package zoho;

import java.util.Scanner;

public class dec2Mixed {

    //separate int and dec part
    //numerator = mul dec part by 10lakhs
    //assign denominator = 10lakhs
    //divide numerator and denominator by GCD
    //GCD
    //then print it

    public static int findGcd(int a,int b){
        while(b!=0){
           int temp = b;
            b = a%b;
            a = temp;
        }return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        int intPart = (int)input;
        double decPart = input - intPart;

        int denominator = 1000000;
        int numerator = (int) Math.round(decPart*denominator);

        int gcd = findGcd(numerator,denominator);

        System.out.println("GCD = "+gcd);
        numerator = numerator/gcd;
        denominator = denominator/gcd;

        System.out.println(intPart + " "+numerator+"/"+denominator);
    }
}
