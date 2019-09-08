import java.util.Scanner;

public class BonAppet {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int b=sc.nextInt();
	int sum=0;
    for(int i=0;i<n;i++) {
    	if(i!=k) {
    		sum+=a[i];
    	}
    }
    int actual=sum/2;
    if(b>actual) {
    	System.out.println(b-actual);
    }
    else {
    	System.out.println("Bon Appetit");
    }
}
}
