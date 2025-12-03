// Rotate a Matrix by 90 Degree
// You are given a n x n 2-D matrix representing an image, 
// rotate the image by 90 degrees (clockwise).

// Input Format
// The first line will contain two integers n and n again.

// The next n lines contain n integers each representing
//  the matrix.

// Output Format
// Return a matrix that is rotated by 90 degrees in the 
// clockwise direction.

// Example 1
// Input

// 2 2 
// 1 2
// 2 3 
// Output

// 2 1 
// 3 2
// Explanation

// We do a 90 degree clockwise rotation of the matrix.

// Example 2
// Input

// 3 3
// 7  2  3 
// 2  3  4 
// 5  6  1 
// Output

// 5 2 7
// 6 3 2
// 1 4 3
// Explanation

// We do a 90 degree clockwise rotation of the matrix.

// Constraints
// 1 <= n <= 100

// Inplace solution

// Topics
// 2D-Arrays

import java.util.*;
public class twoD6{
    public static void swapping(int[][]mat){
           for (int row=0;row<mat[0].length;row++){
                int li=0;
                int ri= mat[0].length-1;
                 
                while (li<ri){
                    int temp = mat[row][li];
                    mat[row][li] = mat[row][ri];
                    mat[row][ri]= temp;
                    
                    li++;
                    ri--;
                }
            }
    }
    public static void nextstep(int[][]mat,int n, int m){
        for (int row  =0;row<mat.length;row++){
            for (int col = row+1;col<mat[row].length;col++){
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
           swapping(mat);
 
        for (int row=0;row<mat.length;row++){
            for (int col = 0;col<mat[row].length;col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] mat= new int[n] [m];
        for (int row=0;row<mat.length;row++){
            for (int col = 0;col<mat[row].length;col++){
                mat[row][col] = sc.nextInt();
            }
        }
        nextstep(mat,n,m);
    }
}