package zoho;

public class bin2hex2bin {
    public static void main(String[] args) {
        String bin = "1011011";
        String hexValue = bin2hex(bin);
        System.out.println(hexValue);
    }
    private static String bin2hex(String bin){
        int decConverted = Integer.parseInt(bin,2);

        String hexValue = Integer.toHexString(decConverted);

        int decimal = Integer.parseInt(hexValue,16);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary :"+binary);

        return hexValue;
    }
}
