import java.io.*;
import java.util.*;
public class GFG {
    static int max= 1000000;
    static int spf[]= new int[max+1];
    static int fact[]= new int[max+1];
	public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    factors();
	    int n= sc.nextInt();
	    HashMap<Integer, Integer> hm= new HashMap<Integer, Integer>();
	    for(int i=0;i<n;i++)
	    {
	        int x= sc.nextInt();
	        if(hm.containsKey(fact[x]))
	            hm.put(fact[x],hm.get(fact[x])+1);
	        else
	            hm.put(fact[x],1);
	    }
	    long ans=0;
	    for(Map.Entry<Integer, Integer> entry: hm.entrySet())
	    {
	        int k= entry.getKey();
	        int v= entry.getValue();
	        if(v>=2)
	            ans+=v*(v-1)/2;
	    }
	    System.out.println(ans);
	    
	}
	public static void factors()
	{
	    shortest();
	    fact[1]=1;
	    for(int i=1;i<=max;i++)
	    {
	        int j=i;
	        int k=spf[j];
	        int ans=1;
	        int count=1;
	        j=j/spf[j];
	        while(j!=1)
	        {
	            if(spf[j]==k)
	                count++;
	            else 
	            {
	                k=spf[j];
	                ans*=(count+1);
	                count=1;
	            }
	            j/=spf[j];
	        }
	        ans*=(count+1);
	        fact[i]=ans;
	    }
	    
	}
	public static void shortest()
	{
	    for(int i=1;i<=max;i++)
	    {
	        spf[i]= 1;
	    }
	    for(int i=2;i*i<=max;i++)
	    {
	        if(spf[i]==1)
	        {
	            for(int j=i*i;j<=max;j+=i)
	            {
	                if(spf[j]==1)
	                    spf[j]=i;
	            }
	        }
	    }
	    for(int i=2;i<=max;i++)
	    {
	        if(spf[i]==1)
	            spf[i]=i;
	    }
	    /*for(int i=1;i<=max;i++)
	    {
	        System.out.print(spf[i]+" ");
	        if(i%20==0)
	            System.out.println();
	    }*/
	}
}