/*Even Sum
You are given a number N. Print sum of all even numbers from 1 to N.

Input Format
There is only an integer N.

Output Format
Print the sum as a single integer.

Example 1
Input

12
Output

42
Explanation

The sum of even numbers till 12 is 42. (2+4+6+8+10+12=42)

Example 2
Input

13
Output

42
Explanation

The sum of even numbers till 12 is 42. (2+4+6+8+10+12=42)

Constraints
1 <= |N| <= 10^9 */


import java.util.*;
public class loop8{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0; i<=n; i++){
        if (i%2==0){
        sum = sum + i;
        }
        }
        System.out.println(sum);
        }
    }