import java.util.Scanner;

public class Ngirls {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int max=0;
	int start=0;
	for(int i=1;i<s.length();i++) {
		if(s.charAt(i)==s.charAt(i-1)) {
			int lent=i-start-1;
			if(max<lent) {
				max=lent;
			}
			start=i;
		}
		else {
			int lent=i-start+1;
			if(max<lent) {
				max=lent;
			}
		}
	}
	if(max==0) {
		System.out.println(1);
	}
	else
	System.out.println(max);
	
	
	
	
}
}
