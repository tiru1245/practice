package basic;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ColorGraph {
	static boolean visited[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			LinkedList<Integer> list[]=new LinkedList[n];
			 visited=new boolean[n];

			for(int i=0;i<n;i++)
			{
				list[i]=new LinkedList<Integer>();
			}
			for(int i=0;i<m;i++)
			{
				int u=sc.nextInt()-1;
				int v=sc.nextInt()-1;
				list[u].add(v);
				list[v].add(u);
			}
			dfs(0,n,list);
			 visited=null;

		}
	}

	private static void dfs(int start, int j, LinkedList<Integer>[] list2) {
		visited[start]=true;
		System.out.println(start);
		dfs1(start,j,list2);
		
		
		
	}

	private static void dfs1(int start, int j, LinkedList<Integer>[] list2) {
		List list=list2[start];
		for(int i=0;i<list.size();i++)
		{
			int v=(int) list.get(i);
			if(!visited[v])
			{
				System.out.println(v);
				visited[v]=true;
				dfs1(v,j,list2);
			}
			
		}
		
	}

}
