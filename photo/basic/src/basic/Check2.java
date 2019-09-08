package basic;

import java.io.*;
import java.util.*;
import static java.lang.Math.*;
 
public class Check2
{

	
 	
 	static int temp_ans=0;
 	static int vertex=0;
 
 	static ArrayList<Integer> list[];
 	static int visit[];
 	static int flag;
 	static int color[];
 
 	static void dfs(int i,int level)
 	{
 		if(visit[i]==0)
 		{
 			visit[i]++;
 			vertex++;
 			if(level%2==0)
 			{
 				color[i]=1;
 				temp_ans++;
 			}
 			else
 			{
 				color[i]=-1;
 			}
 
 			for(int in:list[i])
 			{
 				if(visit[in]!=0 && color[i]==color[in])
 					flag=-1;
 				if(visit[in]==0)
 					dfs(in,level+1);
 			}
 		}
 	}
 
 	
 
	public static void main(String args[]) throws Exception
	{

		Scanner sc=new Scanner(System.in);
		PrintWriter w=new PrintWriter(System.out);
 		
 		int t=sc.nextInt();
 		
 		while(t-- >0)
 		{
 		    int n = sc.nextInt();
 		    int m = sc.nextInt();
 		    list=new ArrayList[n+1];
 		    
 		    for(int i=1;i<=n;i++)
 		    {
 		    	list[i]=new ArrayList<Integer>();
 		    }
 		    for(int i=0;i<m;i++)
 		    {
 		    	int u=sc.nextInt();
 		    	int v=sc.nextInt();
 		    
 		    
 		    	list[u].add(v);
 		    	list[v].add(u);
 		    }
 	
 			int ans=0;
 			visit=new int[n+1];
 			int flag1=0;
 			color=new int[n+1];
 			for(int i =1;i<=n;i++)
 			{	
 				if(visit[i]==0)
 				{
 					vertex=0;
 					temp_ans=0;
 					flag=0;
 
 					dfs(i,0);
 					if(flag==-1)
 					{
 						flag1++;
 						
 					}
 
 				
 						
 					ans+=max(temp_ans,vertex-temp_ans);
 				}
 			}
 
 			if(flag1!=0)
 				w.println("NO");
 			else
 		    	w.println(ans);
 		}
 		
		w.close();
	
	}
 	
	
}