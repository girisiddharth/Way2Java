import java.util.*;
public class twoD4 {
    public static void nextstep(int mat[][],int n, int m){
            for (int row =0;row<n;row++){
            
              if (row%2==0){
                for (int col = 0;col<m;col++){
                    System.out.print(mat[row][col]);
                }
              }
              else{
                for (int col=m-1;col>=0;col--){
                 System.out.print(mat[row][col]);
                }
                
              }
              
            }
              
            
              
        
    }
    public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    int m = sc.nextInt();
    int mat[] [] = new int[n] [m];
    for (int row=0;row<mat.length;row++){
        for (int col=0;col<mat.length;col++){
            mat[row][col] = sc.nextInt();
        }
    }
    nextstep(mat,n,m);
    }

}
