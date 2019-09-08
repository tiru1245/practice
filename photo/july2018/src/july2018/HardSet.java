package july2018;

import java.util.*;
public class HardSet
{
    public static void main(String aargs[])
    {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt() ;
        ArrayList<Integer>  K=new ArrayList<Integer>();
        for(int i=0;i<k;i++)
            K.add(sc.nextInt());
        ArrayList<Integer> A=new ArrayList<Integer>();
        ArrayList<Integer> B=new ArrayList<Integer>();
 
        for(int i=0;i<k;i++) 
        {
            int number=K.get(i);
            int one=number/2 ;
            int two=number-one ;
            
            if(one>0&&two>0)
            {
                if((!A.contains(one)||!B.contains(two))) 
                {
                    if(!A.contains(one))
                        A.add(one);
                    if(!B.contains(two))
                        B.add(two);
                }
            }
        }
        System.out.println(A.size());
        for(int a:A)
            System.out.print(a+"  ");
        System.out.println();
        System.out.println(B.size());
        for(int a:B)
            System.out.print(a+"  ");
    }
 }