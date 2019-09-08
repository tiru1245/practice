import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NumberOfShortestPaths {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		LinkedList<Pair> graph[]= new LinkedList[n+1];
		for(int i=1;i<=n;i++) {
			graph[i]=new LinkedList();
		}
		for(int i=0;i<m;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			graph[u].add(new Pair(v));
			graph[v].add(new Pair(u));
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
			int source=sc.nextInt();
			int destion=sc.nextInt();
			if(source==destion) {
				System.out.println(0);
			}
			else {
				dsf(source,destion,graph);
				
			}
			
		}
	}

	private static void dsf(int source, int destion, LinkedList<Pair>[] graph) {
		List<Pair> list=graph[source];
		for(int j=0;j<list.size();j++) {
		  boolean b[]=new boolean[graph.length];
		  b[source]=true;
			dsfUtil(list.get(j),destion,graph,b,1);
			System.out.println();
		}
		
	}

	private static void dsfUtil(Pair pair, int destation,LinkedList<Pair>[] graph, boolean[] b,int count) {
	         Pair p=pair;
			b[p.vertix]=true;
			System.out.print(p.vertix+"-> ");
			List list = graph[p.vertix];
			if(destation==pair.vertix) {
				
			}
			else {
				for(int j=0;j<list.size();j++) {
					
					 Pair pa=(Pair) list.get(j);
					 if(!b[pa.vertix])
							 dsfUtil((Pair)list.get(j),destation,graph,b,count);
						}
						
					}
			}
			
		
}
 class Pair{
	 int vertix;
	 int steps;
	 public Pair(int vertix) {
		 this.vertix=vertix;
	 }
 }
