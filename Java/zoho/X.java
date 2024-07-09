// Java program to 
// print cross pattern 
class X { 

	// Function to print given 
	// string in cross pattern 
	static void pattern(String str, int len) 
	{
		// i and j are the indexes 
		// of characters to be 
		// displayed in the ith 
		// iteration i = 0 initially 
		// and go upto length of string 
		// j = length of string initially 
		// in each iteration of i, 
		// we increment i and decrement j, 
		// we print character only 
		// of k==i or k==j 
		for(int i=0;i<len;i++){
            int k = len-i-1;
            for(int j=0;j<len;j++){
                if(i==j||j==k){
                    System.out.print(str.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		String str = "123"; 
		int len = str.length(); 
		pattern(str, len); 
	} 
} 

// This code is contributed 
// by Smitha
