package zoho;

import java.util.Scanner;

public class simpleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int size = str.length();
        for(int i=0;i<size;i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                StringBuilder sb = new StringBuilder();
                while (i+1<size && Character.isDigit(str.charAt(i+1))) {
                    sb.append(str.charAt(++i));
                }
                if(sb.length()>0){
                    int x = Integer.parseInt(sb.toString());
                    for(int j=0;j<x;j++){
                        System.out.print(ch);
                    }
                }else{
                    System.out.println(ch);
                }
            }
        }sc.close();
    }
}
