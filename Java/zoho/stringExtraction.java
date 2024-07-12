package zoho;

import java.util.Scanner;

public class stringExtraction
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str,tempstr="";
    str=sc.next();
for(int i=str.length()-1;i>=0;i--){
    if(Character.isAlphabetic(str.charAt(i))){
        int n=Integer.parseInt(str.substring(i+1));
        for(int k=0;k<n;k++){
            tempstr+=str.charAt(i);
        }
        str=str.substring(0,i);
        }
    }
System.out.println(new StringBuffer(tempstr).reverse().toString());
  }
}
