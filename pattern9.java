/*Star Pyramid
Star Pyramid
Given an integer n, print a pyramid full of stars with height equal to n.

Input Format
The first line of input contains the integer n.

Output Format
The output should contain a pyramid filled with stars with height equal to n.

Example 1
Input

3
Output:
    

Pattern Image

Example 2
Input

7
Output

Pattern Image

Constraints
 */
import java.util.*;

   public class pattern9{ 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        for (int i = 1;i <= n;i++){
            for (int j = n;j>=i;j--){
                System.out.print(" ");

            }
            for (int k = 1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        } 
        
        }

}
