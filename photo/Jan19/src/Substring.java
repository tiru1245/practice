import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		String stringa=sc.next();
		
		String stringb=sc.next();
		int a[]=new int[256];
		int b[]=new int[256];
		
	   
		for(int i=0;i<stringa.length();i++) {
			int is=stringa.charAt(i);
				a[is]++;
			
		}
		for(int i=0;i<stringb.length();i++) {
			int is=stringb.charAt(i);
			b[is]++;
		}
		int count=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]>0) {
				if(b[i]<=a[i]) {
						count=count+ b[i];
				}
			}
			
		}
		if(count==stringb.length()) {
			int length=1000;
			int index1=0;
			int index2=0;
			for(int l=0;l<stringa.length();l++) {
				String as="";
				for(int i=l;i<stringa.length();i++) {
					int j=i+1;
					
					String al=stringa.substring(i,j);
					
					int a1[]=new int[256];
					al=as+al;
					for(int k=0;k<al.length();k++) {
						int is=al.charAt(k);
						a1[is]++;
					}
					int count1=0;
					for(int k=0;k<b.length-1;k++) {
						if(b[k]>0) {
							if(b[k]<=a1[k]) {
								count1=count1+ b[k];
							}
						}
						
					}
					if(count1==stringb.length()) {
						if(length>al.length()) {
							length=al.length();
							index1=l;
							index2=j;
						}
					}
					
					as=al;
				
				}
				
			}
			System.out.println(stringa.substring(index1, index2));
		}
		else
		System.out.println(-1);
	}
	}
}
