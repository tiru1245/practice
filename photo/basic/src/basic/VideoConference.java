package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class VideoConference {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
		ArrayList<String> list=new ArrayList<String>();

		while(n-->0)
		{
			String s=sc.next();
			list.add(s);
			
				if(map.containsKey(s))
				{
					if(list.contains(s))
					{
						int ts=(Integer)map.get(s);
						map.put(s, ts++);
					}
					else
					{
						
					}
				}
				else
				{
					map.put(s, 1);
					break;
				}
			
			
			
		}
	}

}
