package BasicJavaPrograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashMapImplementation {
    public static void main(String[] args) {
        //since map is an interface we couldn't able to create obj so we used existing implementation for map ie.hashmap
        Map<String,String> usersInfo = new HashMap<>();
        usersInfo.put("vicky", "9876543210");
        usersInfo.put("john", "838493992");

        System.out.println();
        //to print all the keys present in hashmap
        Set<String> keysForUsersInfo = usersInfo.keySet();
        System.out.println("keysForUsersInfo "+keysForUsersInfo);

        System.out.println("usersInfo "+usersInfo);
        System.out.println("contact info for Vicky "+usersInfo.get("vicky"));
    }
}