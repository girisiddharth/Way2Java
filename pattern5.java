/**Question
easy
Max Score: 30
Star Pattern 2
Take input of N from the user and write a program to print the following pattern (N=3) :


* * * 
* *   
*     


Input Format
First line contains an integer N.

Output Format
Print the required pattern.

Example 1
Input

3

Output

* * * 
* *   
*     


Explanation

Pattern for N=3.

Example 2
Input

4

Output

* * * *
* * * 
* *   
*     

Explanation

Pattern for N=4.  */


import java.util.*;
public class pattern5{
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i=n; i>=1;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
