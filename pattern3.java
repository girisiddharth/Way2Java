/*Rectangle Pattern
You are given two integers N and M.

You are required to write a program that
 prints a Rectangle of size N * M.


Pattern for N = 3 and M = 5

* * * * * 
* * * * * 
* * * * * 

Input Format
single line consisting of two integers N and M.

Output Format
Print the required pattern

Example 1
Input


3 5

Output


* * * * * 
* * * * * 
* * * * * 

Explanation


Pattern for N = 3 and M = 5

Example 2
Input


4 2

Output


* * 
* * 
* * 
* * 
 

Explanation


Pattern for N = 4 and M = 2 */


import java.util.*;
public class pattern3{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        for (int row =1; row <=i;row++){
            for (int column=1;column<=j;column++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}