package ProblemStatements;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'weightedUniformStrings' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY queries
     */

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        s = s.toLowerCase();
        Set<Integer> weights = new HashSet<>();

        int n = s.length();
        int currentWeight = 0;
        char lastChar = '\0';

        // Calculate weights of uniform substrings
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);

            if (currentChar != lastChar) {
                currentWeight = currentChar - 'a' + 1;
            } else {
                currentWeight += currentChar - 'a' + 1;
            }
            
            lastChar = currentChar;
            weights.add(currentWeight);
        }

        // Answer the queries
        List<String> results = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            String isPresent = weights.contains(queries.get(i)) ? "Yes" : "No";
            results.add(i,isPresent);
        }

        return results;

    }

}

public class weightedUniformStrings{
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        String s = "abccddde";
        //String s = sc.nextLine();

        //int queriesCount = 6;
        

        List<Integer> queries = new ArrayList<>();
        // for(int i=0;i<queriesCount;i++){
        //     queries.add(sc.nextInt());
        // }
            queries.add(1);
            queries.add(3);
            queries.add(12);
            queries.add(5);
            queries.add(9);
            queries.add(10);

        List<String> result = Result.weightedUniformStrings(s, queries);

       System.out.println(result);
    }
}

