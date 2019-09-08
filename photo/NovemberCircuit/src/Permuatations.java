
public class Permuatations {
public static void main(String[] args) {
	String a[]= {"A","B","C"};
	permutations(a,0,a.length-1);
}

private static void permutations(String[] a, int i, int j) {
	
	if(i==j) {
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
		System.out.println("");
	}
	else {
		for(int k=i;k<=j;k++) {
			String c=a[k];
			
			a[k]=a[i];
			a[i]=c;
			permutations(a,i+1,j);
			String l=a[i];
			a[i]=a[k];
			a[k]=l;
		}
	}
}
}
