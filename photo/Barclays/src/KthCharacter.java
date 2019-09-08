
import java.util.*;
 
public class KthCharacter {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[26];
        String s=sc.next();
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-97]++;
        }
        int max=0;
        int index=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                index=i;
                
            }
        }
        char l=findchar(index);
        ArrayList list=new ArrayList();
       for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)!=l)
           {
        	   list.add(s.charAt(i));
           }
        }
       Collections.sort(list);
     for(int i=0;i<list.size();i++)
    	 System.out.println(list.get(i));
    
   
}
public static char findchar(int index)
{
    if(index==0)
    {
        return 'a';
    }
    else if(index==1)
    {
        return 'b';
    }
    else if(index==2)
    {
        return 'c';
    }
    else if(index==3)
    {
        return 'd';
    }else if(index==4)
    {
        return 'e';
    }else if(index==5)
    {
        return 'f';
    }
    else if(index==6)
    {
        return 'g';
    }else if(index==7)
    {
        return 'h';
    }
    else if(index==8)
    {
        return 'i';
    }
    else if(index==9)
    {
        return 'j';
    }else if(index==10)
    {
        return 'k';
    }else if(index==11)
    {
        return 'l';
    }else if(index==12)
    {
        return 'm';
    }else if(index==13)
    {
        return 'n';
    }else if(index==14)
    {
        return 'o';
    }else if(index==15)
    {
        return 'p';
    }else if(index==16)
    {
        return 'q';
    }else if(index==17)
    {
        return 'r';
    }else if(index==18)
    {
        return 's';
    }
    else if(index==19)
    {
        return 't';
    }else if(index==20)
    {
        return 'u';
    }else if(index==23)
    {
        return 'v';
    }else if(index==21)
    {
        return 'w';
    }else if(index==22)
    {
        return 'x';
    }else if(index==23)
    {
        return 'y';
    }
    else if(index==24)
    {
        return 'z';
    }
    else
    	return 'a';
}
}
