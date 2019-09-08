
public class Index {
public static void main(String[] args) {
	int a[]={-6,2,3, 4,-7,12,4,7,-7,5,8,3};
	int b=0;
	int max=0;
	int index=0;
	for(int i=0;i<a.length;i++) {
		if(i%3==0) {
			if(max<b) {
				max=b;
				index=i-1;
			}
			b=0;
			b+=a[i];
			
		}
		else {
			b+=a[i];
		}
	}
	if(index%4==0) {
		System.out.println("Summer");
	}
	else if(index%4==1) {
		System.out.println("winter");

	}
else if(index%4==2) {
	System.out.println("sping");

	}
else if(index%4==3) {
	System.out.println("fal");

}
}
}
