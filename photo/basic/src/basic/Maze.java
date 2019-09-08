package basic;

import java.util.Scanner;

public class Maze {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=0;
		int y=0;
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			if('L'==s.charAt(i)) {
				x-=1;
			}
			else if('R'==s.charAt(i)) {
				x+=1;
			}
			else if('U'==s.charAt(i)) {
				y+=1;
			}
			else if('D'==s.charAt(i)) {
				y-=1;
			}
		}
		System.out.println(x+" "+y);
	}

}
