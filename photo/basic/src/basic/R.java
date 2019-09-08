package basic;
import java.io.*;
import java.util.*;


public class R {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
    	int a[]=new int[grades.length];
        for(int i=0;i<grades.length;i++)
        {
            int n=grades[i];
            if(n<38)
            {
            	a[i]=n;
            }
            else
            {
            	if(n<=95)
            	{
            		int round1=n%5;
            		 int s=5-round1;
            		 int round=s+n;
                     if((round-n)<3)
                        {
                        	a[i]=round;

                        }
                        else
                        {
                        	a[i]=n;
     
                        }
                    	
            	}
            	else
            	{
            		int round=100;
                    if((100-n)<3)
                       {
                       	a[i]=round;

                       }
                       else
                       {
                       	a[i]=n;
    
                       }
            	}
                
                
            }
            
        }
		return a;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);
        for(int i=0;i<result.length;i++)
        {
        	System.out.println(result[i]);
        }

      
    }
}
