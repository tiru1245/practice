package basic;


/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
public class S {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        String input[] = name.split(" ");
        long S = Long.parseLong(input[0]);
        long X = Long.parseLong(input[1]);
        long N = Long.parseLong(input[2]);
 
        TreeMap<Long, Long> treeMap = new TreeMap<>();
        while (N > 0) {
            name = br.readLine();                // Reading input from STDIN
            input = name.split(" ");
            long t = Long.parseLong(input[0]);
            long d = Long.parseLong(input[1]);
            treeMap.put(t, d);
            --N;
        }
        long sum = 0;
        long days = 0;
        long ans = 0;
        while (sum < S) {
            Map.Entry<Long, Long> entry = treeMap.pollFirstEntry();
           if(entry!=null) {
                sum += ((entry.getKey() - 1 - days) * X);
                ans += (entry.getKey() - 1 - days);
                if (sum > S) {
                    long v = (sum - S) / X;
                    if (v > 0) {
                        ans -= v;
                    }
                    break;
                }
                sum += entry.getValue();
                ans++;
                days = entry.getKey();
            }else {
                long x = (S-sum)/X;
                long rem =  (S-sum)% X;
                if(rem>0){
                    x++;
                }
                ans += x;
                break;
            }
        }
        System.out.println(ans);
    }
}

