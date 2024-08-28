package Fidelity;

/*
 * Rahul has an array a, consisting of n integers a1, a2, …, an. The boy cannot sit and do nothing, he decided to study an array. Rahul took a piece of paper and wrote out m integers l1, l2, …, lm (1 ≤ li ≤ n). For each number li he wants to know how many distinct numbers are staying on the positions li, li + 1, …, n. Formally, he want to find the number of distinct numbers among ali, ali + 1, …, an.?

Rahul wrote out the necessary array elements but the array was so large and the boy was so pressed for time. Help him, find the answer for the described question for each li.

Input

The first line contains two integers n and m (1 ≤ n, m ≤ 105). The second line contains n integers a1, a2, …, an (1 ≤ ai ≤ 105) — the array elements.
Next m lines contain integers l1, l2, …, lm. The i-th line contains integer li (1 ≤ li ≤ n).
Output

Print m lines — on the i-th line print the answer to the number li.
Examples

Input
10 10
1 2 3 4 1 2 3 4 100000 99999
1
2
3
4
5
6
7
8
9
10
Output
6
6
6
6
6
5
4
3
2
1
 */


import java.util.HashSet;
import java.util.Scanner;

public class DistinctNumbersInSubarray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();
    int n = sc.nextInt();

    int a[] = new int[m];
    int s[] = new int[n];

    for(int i=0;i<m;i++){
        a[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
        s[i] = sc.nextInt();
    }
    HashSet<Integer> set = new HashSet<Integer>();

    for(int i=n-1;i>=0;i--){
        set.add(a[i]);
        s[i] = set.size();
        System.out.println("Print s[i] = "+s[i]);
    }
    for(int num:s)
    System.out.println(num);
    }
}