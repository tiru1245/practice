import java.io.*;
import java.util.*;
import java.math.*;
 
public class Utkarsh {
 
    InputStream is;
    PrintWriter out;
    
    long mod = (long)(1e9 + 7), inf = (long)(3e18);
    
    int play(ArrayList <Integer> a, int ans) {
        int z = a.size();
        for(int i = 0; i < z; i++) {
            int j = i - ans, r = a.get(i);
            while(j >= 0) {
                int l = a.get(j);
                int len = r - l + 1;
                int cnt = i - j + 1;
                if(cnt >= (len / 2)) {
                    ans = cnt;   j--;
                }
                else    j = i - (len / 2) + 1;
            }
        }
        return ans;
    }
    
    void solve() {
        int t = ni();
        while(t-- > 0) {
            int n = ni();
            char s[] = ns(n);
            //out.println(new String(s));
            int ans = 0;
            ArrayList <Integer> a[] = new ArrayList[26];
            for(int i = 0; i < 26; i++)  a[i] = new ArrayList<>();
            for(int i = 0; i < n; i++)  a[s[i] - 'a'].add(i);
            for(int i = 0; i < 26; i++) {
                ans = play(a[i], ans);
            }
            ans = (ans << 1) + 1;
            if(ans > n) ans = n;
            out.println(ans);
        }
    }
    
    char[] input(int n) {
        char s[] = new char[n];
        for(int i = 0; i < n; i++)  s[i] = (char)(int)(Math.random() * 2 + 'a');
        return s;
    }
 
    long mp(long b, long e, long mod) {
        b %= mod;
        long r = 1;
        while(e > 0) {
            if((e & 1) == 1) {
                r *= b; r %= mod;
            }
            b *= b; b %= mod;
            e >>= 1;
        }
        return r;
    }
 
    //---------- I/O Template ----------
    
    public static void main(String[] args) { new Utkarsh().run(); }
    void run() { 
        is = System.in; 
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }
    
    byte input[] = new byte[1024];
    int len = 0, ptr = 0;
    
    int readByte() { 
        if(ptr >= len) { ptr = 0; 
            try { len = is.read(input); } 
            catch(IOException e) { throw new InputMismatchException(); } 
            if(len <= 0) { return -1; } 
        } return input[ptr++];
    }
    boolean isSpaceChar(int c) { return !( c >= 33 && c <= 126 ); }
    int skip() { 
        int b = readByte(); 
        while(b != -1 && isSpaceChar(b)) { b = readByte(); } 
        return b;
    }
    
    char nc() { return (char)skip(); }
    String ns() { 
        int b = skip(); 
        StringBuilder sb = new StringBuilder(); 
        while(!isSpaceChar(b)) { sb.appendCodePoint(b); b = readByte(); } 
        return sb.toString();
    }
    String nLine() { 
        int b = skip(); 
        StringBuilder sb = new StringBuilder(); 
        while( !(isSpaceChar(b) && b != ' ') ) { sb.appendCodePoint(b); b = readByte(); } 
        return sb.toString();
    }
    int ni() { 
        int n = 0, b = readByte(); 
        boolean minus = false; 
        while(b != -1 && !( (b >= '0' && b <= '9') || b == '-')) { b = readByte(); } 
        if(b == '-') { minus = true; b = readByte(); } 
        if(b == -1) { return -1; }  //no input 
        while(b >= '0' && b <= '9') { n = n * 10 + (b - '0'); b = readByte(); } 
        return minus ? -n : n;
    }
    long nl() { 
        long n = 0L;    int b = readByte(); 
        boolean minus = false; 
        while(b != -1 && !( (b >= '0' && b <= '9') || b == '-')) { b = readByte(); } 
        if(b == '-') { minus = true; b = readByte(); } 
        while(b >= '0' && b <= '9') { n = n * 10 + (b - '0'); b = readByte(); } 
        return minus ? -n : n;
    }
 
    double nd() { return Double.parseDouble(ns()); }
    float nf() { return Float.parseFloat(ns()); }
    int[] na(int n) { 
        int a[] = new int[n]; 
        for(int i = 0; i < n; i++) { a[i] = ni(); } 
        return a;
    }
    char[] ns(int n) { 
        char c[] = new char[n]; 
        int i, b = skip(); 
        for(i = 0; i < n; i++) { 
            if(isSpaceChar(b)) { break; } 
            c[i] = (char)b; b = readByte(); 
        } return i == n ? c : Arrays.copyOf(c,i);
    }
}