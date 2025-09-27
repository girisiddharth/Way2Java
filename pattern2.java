 /*Rectangle Pattern
You are given two integers N 

You are required to write a program that prints a square of size N .


Pattern for N = 3 

* * * 
* * *  
* * * 

Input Format
single line consisting of two integers N 

Output Format
Print the required pattern

Example 1
Input


3 

Output


* * *  
* * *  
* * *  

Explanation


Pattern for N = 3

Example 2
Input


4 

Output


* * * *
* * * *
* * * *
* * * *

 

Explanation


Pattern for N = 4 */ 
  

import java.util.*;
public class pattern2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        for (int row = 1; row <=i; row++){
            for (int col = 1; col<=i;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}