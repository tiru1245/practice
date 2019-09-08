

public class HackerEarhth5 {
public static void main(String[] args) {
	HackerEarhth5 he =new HackerEarhth5();
	he.output();
}

 void output() {
	int [] x= {7,8,9};
	int [] y= fix(x);
	System.out.print(x[0]+x[1]+x[2] +" ");
	System.out.println(y[0]+y[1]+y[2]);
}

 int[] fix(int[] z) {
	 z[1]=4;
	return z;
}
}
