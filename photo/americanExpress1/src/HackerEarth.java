

import java.util.StringTokenizer;

public class HackerEarth {
public static void main(String[] args) {
	String s="hackerearth hackathons";
	StringTokenizer val =new StringTokenizer(s, "h");
	while(val.hasMoreTokens()) {
		System.out.print(val.nextToken());
	}
}
}
