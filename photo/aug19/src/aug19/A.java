package aug19;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
       String s=sc.next();
       char a[]=s.toCharArray();
       int d=0;
	   for(int i=0;i<n;i++) {
		   if(a[i]=='.') {
			   a[i]='B';
			   d++;
		   }
	   }
	   if(d==0) {
		   System.out.println("NO");
		   
	   }
	   else {
		   System.out.println("YES");
		   for(int i=0;i<n;i++) {
			   System.out.print(a[i]);
		   }
	   }
	   
	}

}