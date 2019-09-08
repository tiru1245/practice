
import java.util.ArrayList;
import java.util.Scanner;

public class ModifiedKaprekar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList list=new ArrayList();
        list.add(1);
        for(int i=1;i<100000;i++){
            if(isKaprekar(i)){
                list.add(i);
            }
        }
        int p=sc.nextInt();
        int q=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<list.size();i++){
            int num=(int) list.get(i);
            if(num>=p&&num<=q){
                System.out.print(num+" ");
                flag=true;
            }
            
        }
        if(!flag){
            System.out.println("INVALID RANGE");
        }
    }

    private static boolean isKaprekar(long i) {
        long square=i*i;
        String s=Long.toString(square);
        boolean flag=false;
        int mid=s.length()/2;
        String sub1=s.substring(0, mid);
        String sub2=s.substring(mid,s.length());
        while(true){
            if(sub2.length()==s.length())
            break;
            else
            {
                 sub1=s.substring(0, mid);
                 sub2=s.substring(mid,s.length());
                long ts1=0;
                long ts2=0;
                if(!sub1.isEmpty()){
                     ts1=Long.parseLong(sub1);
                     
                }
                if(!sub2.isEmpty())
                    ts2=Long.parseLong(sub2);
                
                 if(ts1+ts2==i){
                     flag=true;
                     break;
                 }
                 else{
                     mid--;
                 }
                
            }
        }
        
        
        
        return flag ;
    }

}