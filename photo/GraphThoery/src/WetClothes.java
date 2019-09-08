import java.util.Scanner;

public class WetClothes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int g=sc.nextInt();
		int t[]=new int[n];
		for(int i=0;i<n;i++) {
			t[i]=sc.nextInt();
		}
		int a[]=new int[m];
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		
		int count=0;
		int j=0;
		boolean vistied[]=new boolean[m];
		for(int i=0;i<n;i++) {
			int time=0;
			if(i==0) {
			time=t[0];
			}
			else {
				time=t[i]-t[i-1];
			}
			for(int k=0;k<m;k++) {
				
				if(time>=a[k]) {
					if(!vistied[k]) {
						count++;
						vistied[k]=true;
					}
					
					
				}
				else {
					break;
				}
				
			}
		}
	   int remain=m-1-j;
		System.out.println(count+remain);
	}

	private static void quicksort(int[] a, int i, int j) {
		if(i<j) {
			int pivatal=partition(i,j,a);
			quicksort(a, pivatal, pivatal);
			quicksort(a, pivatal+1, j);

		}
		
		
		
	}

	private static int partition(int l, int h, int[] a) {
		int i=l-1;
		int pivtoal=a[h];
		
		for(int k=l;k<h;k++) {
			if(a[k]<=pivtoal) {
				i++;
				int temp=a[k];
				a[k]=a[i];
				a[i]=temp;
				
			}
		}
		i++;
		int temp=a[h];
		a[h]=a[i];
		a[i]=temp;
		return i;
	}

}
