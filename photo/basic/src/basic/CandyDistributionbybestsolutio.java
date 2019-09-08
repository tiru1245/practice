package basic;

import java.util.HashMap;
import java.util.Scanner;

public class CandyDistributionbybestsolutio {
static long mod=(long) (1e9+7);
static HashMap<Long,Long> hm=new HashMap<Long, Long>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(count(n - 1));
 
    }
 
    static long count(long i) {
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            return 1;
        }
        if(hm.containsKey(i)) {
            return hm.get(i);
        } 
        long ans = 0;
        for (int j = 1; j <= Math.sqrt(i); j++) {
            long q = i / j;
            if (i%j==0) {
                long temp = count(j-1);
                ans = (long) (ans + expo(temp,q))%mod;
               // System.out.println("j= " + j + " temp=" + temp);
                if (j != Math.sqrt(i) && j != 1) {
                    temp = count(q-1);
                 //   System.out.println("q= " + q + " temp=" + temp);
                    ans = (long) (ans + expo(temp,j))%mod;
                }
            }
        }
        long k=ans%mod;
        hm.put(i,k);
        return k;
    }
    static long expo(long a,long b){
    long result=1;
    while(b>0){
    
        if((b&1)>0){
        result=(result*a)%mod;
        }
        
        a=(a*a)%mod;
        b>>=1;
    }
    return result%mod;
    }
}
