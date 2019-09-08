import java.util.ArrayList;
import java.util.Scanner;

public class ThenDic {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	
	boolean isvalid=true;
	ArrayList list= new ArrayList();
	int l=0;
	for(int i=0;i<s.length();i++) {
		int num=Integer.parseInt(s.substring(i, i+1));
		list.add(num);
		if(num>6) {
			isvalid=false;
			break;
		}
		else if(num==6){
			l++;
		}
		
	}
	if(isvalid) {
		if((int)list.get(list.size()-1)==6) {
			System.out.println(-1);
		}
		else {
			System.out.println(s.length()-l);
		}
		
		
	
	}
	else {
		System.out.println(-1);
	}
	
}
}
