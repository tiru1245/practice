import java.util.Scanner;

public class SubStringSplice {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		String s=sc.next();
		int a[]=new int[26];
		for(int i=0;i<s.length();i++) {
			a[97-s.charAt(i)]++;
		}
	}
}
}
