

import java.util.Scanner;
public class NodivisibleSet {
	
      
        public static void main(String[] args) { Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        
        int[] count = new int[k];
        for (int i=0; i<n; i++) {
            int a = in.nextInt();
            count[a % k]++;
        }
        
        int sum = count[0] > 0 ? 1 : 0;
        
        for (int i=1; i <= (k-1) / 2; i++) {
            sum += Math.max(count[i], count[k-i]);
        }
        if (k % 2 == 0 && count[k % 2] > 0) {
            sum++;
        }
        System.out.println(sum);
    }
      
}