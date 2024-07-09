package zoho;

public class AdjacentPairsDifference {
    public static void main(String[] args) {
        String str1 = "asdfghij";
        String str2 = "adsfgijh";
        
        if (str1.length() != str2.length()) {
            System.out.println("Strings must be of equal length.");
            return;
        }
        
        int n = str1.length();
        
        System.out.println("Output:");
        for (int i = 0; i < n - 1; i++) {
            char c1 = str1.charAt(i);
            char c2 = str1.charAt(i + 1);
            char d1 = str2.charAt(i);
            char d2 = str2.charAt(i + 1);
            
            if (c1 != d1 || c2 != d2) {
                System.out.println("" + c1 + c2 + "-" + d1 + d2);
            }
        }
    }
}
