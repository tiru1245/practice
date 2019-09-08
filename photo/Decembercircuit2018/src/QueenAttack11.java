import java.util.Scanner;

public class QueenAttack11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n+1][n+1];
        int k=sc.nextInt();
        int qr=sc.nextInt();
        int qc=sc.nextInt();
        a[qr][qc]=1;
        while(k-->0) {
            int br=sc.nextInt();
            int bc=sc.nextInt();
            a[br][bc]=1;
        }
        int count=0;
        int ji=qr;
                for(int j=qc+1;j<=n;j++) {
                    if(a[ji][j]==1)
                    {
                        break;
                    }
                    else
                    {
                        count++;
                    }
                }
                for(int j=qc-1;j>0;j--) {
                    if(a[ji][j]==1)
                    {
                        break;
                    }
                    else
                    {
                        count++;
                    }
                }
            
            
        
        int li=qc;
            
                for(int j=qr+1;j<=n;j++) {
                    if(a[j][li]==1)
                    {
                        break;
                    }
                    else
                    {
                        count++;
                    }
                }
                for(int j=qr-1;j>0;j--) {
                    if(a[j][li]==1)
                    {
                        break;
                    }
                    else
                    {
                        count++;
                    }
                }
            
            
        
        int i=qr-1;
        int j=qc-1;
        while(i>0&&j>0)
        {
            if(a[i][j]==1) {
                break;
            }
            else {
                count++;
            }
            i--;
            j--;
        }
        int l=qr+1;
        int m=qc+1;
        while(l<=n&&m<=n)
        {
            if(a[l][m]==1) {
                break;
            }
            else {
                count++;
            }
            l++;
            m++;
        }
        int o=qr-1;
        int p=qc+1;
        while(o>0&&p<=n)
        {
            if(a[o][p]==1) {
                break;
            }
            else {
                count++;
            }
            o--;
            p++;
        }
        int q=qr+1;
        int r=qc-1;
        while(q<=n&&r>0)
        {
            if(a[q][r]==1) {
                break;
            }
            else {
                count++;
            }
            q++;
            r--;
        }
        System.out.println(count);
    }

}
