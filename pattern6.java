/*Take input of N from the user and write a program to print the following pattern (N=4) :

      * 
    * * 
  * * *
* * * *  

Input Format
First line contains an integer N.

Output Format
Print the required pattern.

Example 1
Input

4 

Output

      * 
    * * 
  * * *
* * * *  

Explanation

Pattern for N=4.

Example 2
Input

3 

Output

      * 
    * * 
  * * *

Explanation

Pattern for N=3. 

Constraints
1 <= N <= 15 */

import java.util.*;
public class pattern6{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n;i++){
            for (int j = n;j>=i;j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

        }
        System.out.println();
    }
    }
}