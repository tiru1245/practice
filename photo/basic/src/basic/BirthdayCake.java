package basic;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class BirthdayCake {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  TreeMap<Integer,Integer> it=new TreeMap(Collections.reverseOrder());
	  for(int i=0;i<n;i++)
	  {
		  int val=sc.nextInt();
		  if(it.containsKey(val))
		  {
			  it.put(val, it.get(val)+1);

		  }
		  else
		  {
			  it.put(val, 1);
		  }
	  }
	  Iterator iterator2 = it.keySet().iterator();
	  if (iterator2.hasNext()) {
	    Integer key = (Integer) iterator2.next();
	    Integer value = (Integer)it.get(key);
	  System.out.println(value);
	}
	}
}
