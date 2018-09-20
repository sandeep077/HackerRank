import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int pta=0,ptb=0;
        for(int i=0; i<a.toArray().length; i++){
            if(a.get(i) > b.get(i)){
                pta++;
            }else if(a.get(i) < b.get(i)){
                ptb++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(pta);
        ans.add(ptb);
        return ans;
    }
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(21);
        a.add(23);

        List<Integer> b = new ArrayList<>();
        b.add(0);
        b.add(22);
        b.add(24);

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result.toString());
    }
}
