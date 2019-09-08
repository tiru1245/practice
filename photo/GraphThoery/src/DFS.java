import java.util.LinkedList;
import java.util.Scanner;

public class DFS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		LinkedList<Integer> adj[]=new LinkedList[v];
		
		for(int i=0;i<v;i++) {
			adj[i]=new LinkedList();
		}
		for(int i=0;i<e;i++) {
			int u=sc.nextInt();
			int v1=sc.nextInt();
			adj[u].add(v1);
			adj[v1].add(u);
		}
		dfs(0,adj);
	}

	private static void dfs(int v, LinkedList<Integer>[] adj) {
		boolean visited[]=new boolean[adj.length];
		
		DFS(v,adj,visited);
		
		
	}

	private static void DFS(int v, LinkedList<Integer>[] adj, boolean[] visited) {
		LinkedList list=adj[v];
        System.out.print(v+" ");
        visited[v]=true;
        
      for(int i=0;i<list.size();i++){
          
          int ver=(int)list.get(i);
          if(!visited[ver]){
              DFS(ver,adj,visited);
          }
      }
	}

}
