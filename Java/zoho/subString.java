package zoho;

public class subString {
    public static void main(String[] args) {
        String str = "a10";
        for(int i=str.length()-1;i>=0;i--){
            if(Character.isAlphabetic(str.charAt(i))){
              int val = Integer.parseInt(str.substring(i+1));
            for(int k=0;k<val;k++){
                System.out.print(str.charAt(i));
            }
        }
        }
    }
}
