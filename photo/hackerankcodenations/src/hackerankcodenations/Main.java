package hackerankcodenations;

import java.util.Arrays;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int n=sc.nextInt();
        int q=sc.nextInt();
 
        int a[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
 
        Arrays.sort(a);
        int suf[]=new int[n];
        suf[n-1]=a[n-1]+1;
        int val=suf[n-1];
        for(int i=n-2;i>=0;i--){
            if(a[i]+1<a[i+1]){
                suf[i]=a[i]+1;
                val=suf[i];
            }
            else{
                suf[i]=val;
            }
        }
 
        while (q-->0){
            int x=sc.nextInt();
 
            int l=0;
            int r=n-1;
            int ans=-1;
            while (l<=r){
                int mid=(l+r)/2;
                if(a[mid]>x){
                    ans=mid;
                    r=mid-1;
                }
                else l=mid+1;
            }
            if(ans==-1){
            	System.out.println(x+1);
            }
            else{
                if(x+1<a[ans])System.out.println(x+1);
                else System.out.println(suf[ans]);
            }
        }
 
        
    
    } 
}