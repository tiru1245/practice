import java.util.Scanner;

public class SevenSegment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	
		while(t-->0) {
			long total=0;
			String s=sc.next();
			for(int i=0;i<s.length();i++) {
				char s1=s.charAt(i);
				if(s1=='0') {
					total+=6;
				}
				else if(s1=='1') {
					total+=2;
				}
				else if(s1=='2') {
					total+=5;				
								}
				else if(s1=='3') {
					total+=5;
				}
				else if(s1=='4') {
					total+=4;
				}
				else if(s1=='5') {
					total+=5;
				}
				else if(s1=='6') {
					total+=6;
				}
				else if(s1=='7') {
					total+=3;
				}
				else if(s1=='8') {
					total+=7;
				}
				else if(s1=='9') {
					total+=6;			
					}
			}
					int l=(int) (total/2);
					StringBuffer buffer=new StringBuffer();
					for(int k=1;k<=l;k++) {
						buffer.append("1");
					}
					System.out.println(buffer.toString());
				}
				
			
			
		
	}

}
