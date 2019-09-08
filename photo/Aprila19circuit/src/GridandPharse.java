import java.util.Scanner;

public class GridandPharse {
	static String p= "saba";
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		if(n>1) {
			char[][] a=new char[n][m];
			for(int i=0;i<n;i++) {
				String s=sc.next();
				char chararry[]=s.toCharArray();
				for(int j=0;j<m;j++) {
					a[i][j]=chararry[j];
				}
			}
			int length=n+m;
			String to[]=new String[length+2];
			int index=0;
			for(int i=0;i<n;i++) {
				String newstring="";
				for(int j=0;j<m;j++) {
					newstring+=a[i][j];
				}
				to[index]=newstring;
				index++;
			}
			for(int i=0;i<m;i++) {
				String newstring="";
				for(int j=0;j<n;j++) {
					newstring+=a[j][i];
				}
				to[index]=newstring;
				index++;
			}
			String leftdiagonal="";

			for(int i=0,j=0;i<n&&j<m;i++,j++) {
				leftdiagonal+=a[i][j];
			}
			to[index]=leftdiagonal;
			index++;
			
			String rightdiagonal="";

			for(int i=0,j=m-1;i<n && j>-1;i++,j--) {
				rightdiagonal+=a[i][j];
			}
			to[index]=rightdiagonal;
			index++;
			int total=0;
			for(int i=0;i<to.length;i++) {
				StringBuffer r=new StringBuffer(to[i]);
			
				total+=Math.max(count(to[i].toCharArray()), count(r.reverse().toString().toCharArray()));
			}
			System.out.println(total);
		}
		else {
			int total=0;
			String s=sc.next();
			StringBuffer r=new StringBuffer(s);
			
			total+=Math.max(count(s.toCharArray()), count(r.reverse().toString().toCharArray()));
			System.out.println(total);
		}
		
		
	}
	private static int count(char aar[]) {
		int count=0;
		for(int i=0;i<aar.length;) {
			if(aar[i]==p.charAt(0)) {
				int j=1,k=i+1;
				for(;j<p.length()&&k<aar.length;j++,k++) {
					if(p.charAt(j)==aar[k]) {
						
					}
					else {
						i++;
						break;
					}
				}
				if(j==p.length()) {
					count++;
					i=k;
				}
				else {
					i++;
				}
				
			}
			else {
				i++;
			}
		}
		return count;
	}

}
