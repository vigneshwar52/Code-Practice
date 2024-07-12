package zoho;

import java.util.HashMap;
import java.util.Map;

public class stringCompression {
    public static void main(String[] args) {
        String input = "aaaaaaaabbbbbbcccc";
        Map<Character,Integer> map = new HashMap<>();
        for(char ch:input.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry :map.entrySet()){
            sb.append(entry.getKey()).append(entry.getValue());
        }
        System.out.println(sb.toString());
    }
}
