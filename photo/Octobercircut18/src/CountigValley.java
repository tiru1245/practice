import java.util.Scanner;

public class CountigValley {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s=sc.next();

	int countvalley=0;
	int previous = (s.charAt(0)=='D') ? -1 : +1; 
	int seelevel=previous;

	for(int i=1;i<n;i++) {
		int c=(s.charAt(i)=='D') ? -1 : +1;
		seelevel=c+seelevel;
		if(seelevel==0)
		{
			if(previous<0)
			countvalley++;
		}
	
		previous=seelevel;
		
	}
	System.out.println(countvalley);
}
}
