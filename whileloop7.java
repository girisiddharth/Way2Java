/*Print Digits
Given the number n, print its digits starting from most significant digit 
to least significant digit.

Input Format
Input consists of single line which has the integer n.

Output Format
print the digits of number one line at a time.

Example 1
Input

1256
Output

1
2
5
6
Explanation

Here, the digits are, 1,2,5,6.

Example 2
Input

12345
Output

1
2
3
4
5
Explanation

Here the digits are 1,2,3,4,5.

Constraints
1 <= n <= 10^9 */

import java.util.*;
public class whileloop7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int revnum = 0;
        while(n!=0){
        int lastdigit = n%10;
        revnum = revnum*10;
        revnum = lastdigit+revnum;
        n = n/10;
        count ++;
        }
        while (count > 0){
           int lastdigit = revnum%10;
           
           revnum=revnum/10;
           count --;
           System.out.println(lastdigit);
        }
    }
}