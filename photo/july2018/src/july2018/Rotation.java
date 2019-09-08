package july2018;

import java.util.Scanner;

public class Rotation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s=sc.next();
	String t=sc.next();
	long ans = 0;
	for(int i=0;i<s.length();i++) {
		int st = 0;
		if(s.charAt(i) == t.charAt(st)) {
			int j = i;
			while(s.charAt(j) == t.charAt(st)) {
				++st;
				++j;
				if(st>=n || j>=n) break;
			}
			ans = Math.max(ans,st);
		}
	}
	System.out.println(ans);
	
}
}
