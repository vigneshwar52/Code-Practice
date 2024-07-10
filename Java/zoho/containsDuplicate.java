package zoho;

import java.util.ArrayList;
import java.util.Scanner;

public class containsDuplicate {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int L = sc.nextInt();
            ArrayList<Integer> ARR = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                ARR.add(sc.nextInt());
            }

            if (containsAlmostDuplicates(ARR, K, L)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
	}
    public static boolean containsAlmostDuplicates(ArrayList<Integer> arr, int k, int l)
	{
		int size = arr.size();
		for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
			if(Math.abs(arr.get(i)-arr.get(j))<=l && Math.abs(i-j)<=k){
				return true;
			}
        }
		}
        return false;
	}
}
