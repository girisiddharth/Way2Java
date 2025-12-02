

import java.util.*;
public class twoD2{
    public static void nextstep(int[][]mat,int n ,int m){
       for (int row = 0;row<mat.length;row++){
         for (int col = 0;col <mat[row].length;col++){
            System.out.print(mat[row][col]+" ");
         }
         System.out.println();
    }
    }
public static void main(String[]args){
    
    Scanner sc= new Scanner (System.in);
    int n= sc.nextInt();
    int m =sc.nextInt();
    int [] [] mat = new int [n] [m];
    for (int row = 0;row<mat.length;row++){
         for (int col = 0;col <mat[row].length;col++){
            mat[row] [col] = sc.nextInt();
         }
    }
     nextstep(mat,n,m);
}

}
