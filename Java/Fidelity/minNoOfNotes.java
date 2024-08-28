package Fidelity;

import java.util.Scanner;

public class minNoOfNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        countCurrency(amount);
  }
    public static void countCurrency(int amt){
    int noteCounts = 9;
    int notes[] = new int[]{2000,500,200,100,50,20,10,5,1};
    int notesCounter[] = new int[noteCounts];

    for(int i=0;i<noteCounts;i++){
        if(amt>=notes[i]){
            notesCounter[i] = amt/notes[i];
            amt = amt%notes[i];
        }
    }
    for(int i=0;i<notesCounter.length;i++){
        if(notesCounter[i]!=0){
            System.out.println(notes[i]+" : "+notesCounter[i]);
        }
    }
    }
}
