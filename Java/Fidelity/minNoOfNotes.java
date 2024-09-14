package Fidelity;

import java.util.Scanner;

/*
 * Minimum number of currency notes and values that sum to given amount
Given an amount, find the minimum number of notes of different denominations that sum up to the given amount. Starting from the highest denomination note, try to accommodate as many notes as possible for a given amount.
We may assume that we have infinite supply of notes of values {2000, 500, 200, 100, 50, 20, 10, 5, 1} 
Examples: 
Input : 800
Output : Currency  Count 
         500 : 1
         200 : 1
         100 : 1

Input : 2456
Output : Currency  Count
         2000 : 1
         200 : 2
         50 : 1
         5 : 1
         1 : 1
 */


public class minNoOfNotes {
    public static void main(String[] args){
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
