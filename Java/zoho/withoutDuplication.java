package zoho;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class withoutDuplication {
    public static void main(String[] args) {
        int num[] = {131,11,48};
        Set<Integer> distinctSet = new TreeSet<>();
        for(int val:num){
            while (val>0) {
                distinctSet.add(val%10);
                val = val/10;
            }
        }
        for(int res:distinctSet){
            System.out.println(res);
        }
    }
}
