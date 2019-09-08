
import java.util.*;
 
public class SetBit {
    public static void main(String args[] ) throws Exception {
      
     System.out.println(3<<1);
     System.out.println(3 & (3<<1));
    
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int q=sc.nextInt();
        int b[]=new int[N];
        int first=sc.nextInt();
        if(findspecialbit(first))
        {
            b[0]=1;
        }
        else
        {
            b[0]=0;
        }
        for(int i=1;i<N;i++)
        {
            int num=sc.nextInt();
            if(findspecialbit(num))
            {
                b[i]=b[i-1]+1;
            }
            else
            {
                 b[i]=b[i-1];
            }
        }
        while(q-->0)
        {
            int l=sc.nextInt()-1;
            int r=sc.nextInt()-1;
            if(l==0&&r==N-1)
            {
                System.out.println(b[N-1]);
            }
            else
            {
            	if(l==0)
               System.out.println(b[r]);
            	else
            		System.out.println(b[r]-b[l-1]);
            }
            
        }
    }
    public static boolean findspecialbit(int n)
    {
        int prev=-1;
        boolean flag=false;
        while(n>0)
        {
            int d=n%2;
            if(d==prev&&d!=0)
            {
                flag=true;
            	break;
            }
            
            n/=2;
            prev=d;
            
        }
         return flag;
    }
   
}