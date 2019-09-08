package basic;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class FlightSearch {
	  static TreeMap<Integer,ArrayList<String>> map=new TreeMap<Integer,ArrayList<String>>();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String city=sc.nextLine();
		String cities[]=city.split(" ");
		String from=cities[0];
		String to=cities[1];
		TreeMap<String,ArrayList<City>> it=new TreeMap<String,ArrayList<City>>();
		String ns=sc.nextLine();
		int n=Integer.parseInt(ns);
		while(n-->0)
		{
			String a=sc.nextLine();
			String b[]=a.split(" ");
			String from1=b[0];
			String to1=b[1];
			Integer cost=Integer.parseInt(b[2]);
			if(it.containsKey(from1))
			{
				ArrayList s=it.get(from1);
				City c=new City(from1,cost,to1);
				s.add(c);
			}
			else
			{
				ArrayList s=new ArrayList();
				City c=new City(from1,cost,to1);
				s.add(c);
				it.put(from1, s);
			}
		}
	     
			dfs(it,from,to);
        
			
		
		
	}

	private static void dfs(TreeMap<String, ArrayList<City>> it, String from, String to) {
		ArrayList<City> list=it.get(from);
		  for(City c:list)
		  {
			  if(to.equals(c.to))
			  {
				       int cost=c.cost;
				       ArrayList s=new ArrayList();
						City1 c1=new City1(cost,c.to);
						s.add(c1);
						map.put(cost, s);
				  
				  
				  
			  }
			  else
			  {
				  dfs1(it,c.to,to,c.cost);
			  }
		  }
		
	}

	private static void dfs1(TreeMap<String, ArrayList<City>> it, String from, String to, Integer cost) {
		
		ArrayList<City> list=it.get(from);
		  for(City c:list)
		  {
			  if(to.equals(c.to))
			  {
				       int cost1=c.cost+cost;
				       ArrayList s=new ArrayList();
						City1 c1=new City1(cost,c.to);
						s.add(c1);
						map.put(cost, s);
				  
				  
				  
			  }
			  else
			  {
				  
				  dfs1(it,c.to,to,c.cost);
			  }
		  }
	}

}
class City implements Comparable<City>
{
	String from;
	Integer cost;
	String to;
    public City(String from,Integer cost,String to)
    {
    	this.from=from;
    	this.cost=cost;
    	this.to=to;
    }
	@Override
	public int compareTo(City o) {
		// TODO Auto-generated method stub
		return this.to.compareTo(o.to);
	}
    
}
class City1
{
	Integer cost;
	String to;
    public City1(Integer cost,String to)
    {
    	this.cost=cost;
    	this.to=to;
    }
}