package basic;

import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
/**
 * @author Jenish
 */
public class SartajChallenge {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        First solver = new First();
        solver.solve(1, in, out);
        out.close();
    }
    static class First {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int t = in.scanInt();
            while (t-- > 0) {
                int n = in.scanInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = in.scanInt();
                }
                int B[] = new int[n];
                for (int i = 0; i < n; i++) {
                    B[i] = in.scanInt();
                }
                int oddA[] = new int[(int) Math.ceil(n / 2.0)];
                int evenA[] = new int[(int) (n / 2)];
                int o = 0;
                int e = 0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        oddA[o++] = arr[i];
                    } else {
                        evenA[e++] = arr[i];
                    }
                }
                oddA = copyarray(oddA);
                evenA = copyarray(evenA);
                int[] rotatedA = rotate(arr);
                int rooddA[] = new int[(int) Math.ceil(n / 2.0)];
                int roevenA[] = new int[(int) (n / 2)];
                int roo = 0;
                int roe = 0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        rooddA[roo++] = rotatedA[i];
                    } else {
                        roevenA[roe++] = rotatedA[i];
                    }
                }
                rooddA = copyarray(rooddA);
                roevenA = copyarray(roevenA);
                int oddB[] = new int[(int) Math.ceil(n / 2.0)];
                int evenB[] = new int[(int) (n / 2)];
                int ob = 0;
                int eb = 0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        oddB[ob++] = B[i];
                    } else {
                        evenB[eb++] = B[i];
                    }
                }
                if (check(oddA, evenA, oddB, evenB) || check(rooddA, roevenA, oddB, evenB)) {
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            }
        }
        int[] copyarray(int arr[]) {
            int n = arr.length;
            int ans[] = new int[n * 2];
            for (int i = 0; i < n; i++) {
                ans[i] = arr[i];
            }
            for (int i = 0; i < n; i++) {
                ans[i + n] = arr[i];
            }
            return ans;
        }
        int[] rotate(int arr[]) {
            int n = arr.length;
            int t = arr[arr.length - 1];
            int ans[] = new int[n];
            for (int i = n - 1; i > 0; i--) {
                ans[i] = arr[i - 1];
            }
            ans[0] = t;
            return ans;
        }
        boolean check(int oddA[], int[] evenA, int oddB[], int evenB[]) {
            return KMPSearch(oddA, oddB) && KMPSearch(evenA, evenB);
        }
        boolean KMPSearch(int txt[], int pat[]) {
            int m = pat.length;
            int n = txt.length;
            int ans = 0;
            int lps[] = new int[m];
            makelps(pat, m, lps);
            int j = 0;
            int i = 0;
            while (i < n) {
                if (pat[j] == txt[i]) {
                    j++;
                    i++;
                }
                if (j == m) {
                    return true;
                } else if (i < n && pat[j] != txt[i]) {
                    if (j != 0) {
                        j = lps[j - 1];
                    } else {
                        i++;
                    }
                }
            }
            return false;
        }
        void makelps(int pat[], int m, int lps[]) {
            int len = 0;
            lps[0] = 0;
            int i = 1;
            while (i < m) {
                if (pat[i] == pat[len]) {
                    len++;
                    lps[i] = len;
                    i++;
                } else {
                    if (len != 0) {
                        len = lps[len - 1];
                    } else {
                        lps[i] = len;
                        i++;
                    }
                }
            }
        }
    }
    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int INDEX;
        private BufferedInputStream in;
        private int TOTAL;
        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }
        private int scan() {
            if (INDEX >= TOTAL) {
                INDEX = 0;
                try {
                    TOTAL = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TOTAL <= 0) return -1;
            }
            return buf[INDEX++];
        }
        public int scanInt() {
            int I = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    I *= 10;
                    I += n - '0';
                    n = scan();
                }
            }
            return neg * I;
        }
        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }
    }
}
