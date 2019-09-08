import java.util.Scanner;

public class BuildingInCiity {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++) {
			if(j!=i) {
				if(a[i]*a[i]==a[j]) {
					count++;
				}
			}
			
		}
	}
	System.out.println(count);
}
}
