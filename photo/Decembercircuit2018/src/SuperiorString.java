import java.util.Scanner;

public class SuperiorString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			String s=sc.next();
			
			int max=0;
			for(int i=0;i<n;i++) {
				StringBuffer sb=new StringBuffer();
				sb.append(s.charAt(i));
				int a[]=new int[26];
				a[s.charAt(i)-97]++;
				for(int j=i+1;j<n;j++) {
					sb.append(s.charAt(j));
						a[s.charAt(j)-97]++;
					
					int letter=0;
					for(int k=0;k<26;k++) {
						if(letter<a[k]) {
							letter=a[k];
						}
					}
					if(letter>=sb.length()/2) {
						max=Math.max(sb.length(), max);
					}
				}
			}
			System.out.println(max);
		}
	}

}
