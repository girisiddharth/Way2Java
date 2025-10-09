/*Right Angle Triangle Stars
Given an integer n, print a right angled triangle full of 
stars with height and base equal to n.

Input Format
The first line of input contains the integer n.

Output Format
The output should contain a right angled triangle filled with s
tars with height and base equal to n.

Example 1:
Input

3
Output:

*
**
***
Explanation:

Since n = 3, 3 lines with increasing number of stars are printed.

Example 2:
Input

7
Output

*
**
***
****
*****
******
*******
Explanation:

Since n = 7, 7 lines with increasing number of stars are printed.

Constraints
1 <= n <= 200 */

import java.util.*;
public class nestedloop2{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int row=1;row<=n;row++){
        for (int col=1;col<=row;col++){
            System.out.print("* ");
        }
         System.out.println();
    }
   
    
}
}
