

import java.util.Scanner;

public class OrganizingTheContainerBalls {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            int n=sc.nextInt();
            long matrix[][]=new long[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
            int i=0;int j=0;
            while(i<n && j<n){
                long sum=matrix[i][j];
                for(int k=i+1,l=j+1;k<n&l<n;k++,l++) {
                	long rowwise=matrix[k][j];
                    long  columwise=matrix[i][l];
                    if(rowwise==columwise) {
                    sum+=rowwise;
                    matrix[k][j]=0;
                    matrix[k][l]=columwise;
                    matrix[i][l]=0;
                    }
                    else if(rowwise>columwise) {
                          long dif= rowwise-columwise;
                        sum+=columwise;
                        matrix[k][j]=0;
                        matrix[k][l]=columwise;
                        matrix[i][l]=dif;
                        
                    }
                    else if(rowwise<columwise) {
                        long dif= columwise-rowwise;
                      sum+=rowwise;
                      matrix[k][j]=dif;
                      matrix[k][l]=rowwise;
                      matrix[i][l]=0;
                      
                  }
                }
                       
                        
                    
                
                matrix[i][j]=sum;
                i++;
                j++;
            }
            boolean flag=true;
            for(int l=0;l<n;l++){
                for(int k=0;k<n;k++){
                    if(k==l){
                        if(matrix[l][k]==0){
                            flag=false;
                            break;
                        }
                        
                        }
                    else{
                        if(matrix[l][k]!=0){
                            flag=false;
                            break;
                        
                        }
                    }
                }
                if(flag) {
                	
                }
                else {
                	break;
                }
            
        }
            if(flag)
                System.out.println("Possible");
                else
                    System.out.println("Impossible");
            }
    }

}
