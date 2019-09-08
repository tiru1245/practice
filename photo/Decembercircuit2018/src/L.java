import java.util.Scanner;
 
public class L {
public static void main(String[] args) {
 
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		long n=sc.nextLong();
		long k=sc.nextLong();
						n=(long) Math.ceil(Math.sqrt(n));
 
 
        int x = (int) ((Math.log(n) / Math.log(k))); 
        	while(true) {
        		if(x==0) {
        			if(n<k) {
        				System.out.println("Bob");
        				break;
        				
        			}
        			n=n-k;
        			if(n<k) {
        				System.out.println("Alice");
        			}
        			else {
        				System.out.println("Bob");
        			}
        			break;
        		}
            	 long power=powerOfK(k,x);
            	long tilltoal=power;
            	for(int i=(int) (power/k);i>1;){
            		tilltoal+=i;
            		i=(int) (i/k);
            	}
            	
            	if(tilltoal>n/2) {
            		x--;
            	}
            	else if(power==n/2) {
            		System.out.println("Bob");
            		break;
            	}
            	else {
            		long tilltoal1=tilltoal*2;
               	 long power1=powerOfK(k,x+1);
               	     n=n-tilltoal1;
 
            		if(n<power1) {
            			System.out.println("Bob");
            			break;
            		}
            		else {
            			long temp=n;
            			temp=temp-tilltoal1;
            			if(temp<power1) {
                			System.out.println("Alice");
                			break;
                			
                		}
            			else {
                			temp=temp-tilltoal1;
                			if(temp<power1) {
                    			System.out.println("Bob");
                    			break;}
                			else {
                				x++;
                			}
            				
            			}
            			
            		}
            	}
            
        }
				}
 
}
private static long powerOfK(long x, int n) {
	long result=1;
    while(n>0)
    {
        if(n % 2 ==1)
            result=result * x;
        x=x*x;
        n=n/2;
    }
    return result;
	
}
}
