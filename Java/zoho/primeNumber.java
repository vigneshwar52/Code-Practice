package zoho;

public class primeNumber {

    public static Boolean isPrimeNumber(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
            return false;
            }
        }return true;
    }
    public static void main(String[] args) {

    int arr[] = {4,6,9,3,7};
    for(int num:arr){
        if(isPrimeNumber(num)){
            System.out.println(num);
        }
    }        
}
}
