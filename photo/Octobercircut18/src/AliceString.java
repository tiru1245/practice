import java.util.Scanner;

public class AliceString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		boolean flag=true;
		if(a.length()==b.length()) {
			for(int i=a.length()-1;i>=0;i--) {
				int ai=a.charAt(i);
				int bi=b.charAt(i);
			 if(ai>bi) {
				 flag=false;
				 break;
			 }
			}
		}else {
			flag=false;
		}
		
		System.out.println(flag?"YES":"NO");
		
	}

}
