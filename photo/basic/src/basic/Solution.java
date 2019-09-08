package basic;

import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
       String[] times=s.split(":");
      String hr=times[0];
      int hr1=Integer.parseInt(hr);
      String m=times[1];
        String se=times[2];
        String amorpma=se.substring(2,4);
        if(amorpma.equals("AM"))
        {
        	int r=Integer.parseInt(hr)%12;
        	if(r==0)
        	{
        		hr="00";
        		return hr+":"+m+":"+se.substring(0,2);
        	}
        	else
        	{
        		return hr1+":"+m+":"+se.substring(0,2);
        	}
        	
	
        }
        else
        {
        	int r=Integer.parseInt(hr)%12;
        	if(r==0)
        	{
        		hr1=12+r;
        	}
        	else
        	{
        		hr1=r+12;
        	}
    		return hr1+":"+m+":"+se.substring(0,2);

        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scan.nextLine();

        String result = timeConversion(s);
        System.out.println(result);

    }
}
