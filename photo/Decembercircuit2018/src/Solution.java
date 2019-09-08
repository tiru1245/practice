import java.io.*;
import java.util.*;

public class Solution {
  private static InputReader in;
  private static PrintWriter out;

  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out, true);
    int p = in.nextInt(), q = in.nextInt();
    ArrayList<Integer> sol = new ArrayList<Integer>();
    for (int i = p; i <= q; i++) {
      if (ok(i))
        sol.add(i);
    }
    if (sol.size() == 0) {
      out.println("INVALID RANGE");
    } else {
      for (int i = 0; i < sol.size(); i++) {
        if (i > 0) out.print(" ");
        out.print(sol.get(i));
      }
      out.println();
    }
    out.close();
    System.exit(0);
  }
  
  public static boolean ok(int i) {
    long sq = (long)i * (long)i;
    String s = String.valueOf(sq);
    String t = String.valueOf(i);
    int d = t.length();
    if (d == s.length()) return i == 1;
    
    int b1 = Integer.parseInt(s.substring(0,s.length()-d));
    int b2 = Integer.parseInt(s.substring(s.length()-d));
    if (b2 == 0) return false;
    return b1+b2 == i;
  }

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }
  }


}