package hackerankcodenations;

import java.util.Scanner;

public class MigratingBird {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[6];
    for(int i=0;i<n;i++)
    {
        int num=sc.nextInt();
        a[num]++;
    }
    int maxindex=1;
    int max=a[1];
    for(int i=1;i<5;i++)
    {
    	
        if(a[i]<a[i+1]&& max<a[i+1])
        {
        	max=a[i+1];
            maxindex=i+1;
        }
    }
    System.out.println(maxindex);
}
}
