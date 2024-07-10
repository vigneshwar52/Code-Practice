package zoho;

import java.util.HashSet;
import java.util.Set;

//two equal strings adjacent pair
public class AdjacentPairsDifference {
    public static void main(String[] args) {
        String str1 = "asdfghij";
        String str2 = "adsfgijh";
        
        if (str1.length() != str2.length()) {
            System.out.println("Strings must be of equal length.");
            return;
        }
        
        int n = str1.length();
        
        // System.out.println("Output:");
        // for (int i = 0; i < n - 1; i++) {
        //     char c1 = str1.charAt(i);
        //     char c2 = str1.charAt(i + 1);
        //     char d1 = str2.charAt(i);
        //     char d2 = str2.charAt(i + 1);
            
        //     if (c1 != d1 || c2 != d2) {
        //         System.out.println("" + c1 + c2 + "-" + d1 + d2);
        //     }
        // }

        // Set<Character> set = new HashSet<>();

        // for(char ch:str1.toCharArray()){
        //     set.add(ch);
        // }
        // for(int i=0;i<n;i++){
        //  //   if(!set.add(str2.charAt(i))){
        //         if(str1.charAt(i) != str2.charAt(i))
        //         System.out.println(str1.charAt(i)+" - "+str2.charAt(i));
        //  //   }
        // }

        if (str1.length() != str2.length()) {
            System.out.println("Input strings must have equal length.");
            return;
        }

        StringBuilder output1 = new StringBuilder();
        StringBuilder output2 = new StringBuilder();
        int current=0,previous=0;int count = 0;
        for (int i = 0; i < str1.length(); i++) {
           if(str1.charAt(i)!=str2.charAt(i)){
            output1.append(str1.charAt(i));
            output2.append(str2.charAt(i));
            previous = i;count++;
           }
           current = i;
        }
        String result = output1.toString().trim() + " - "+output2.toString().trim();
        System.out.println(result);
    }
}
