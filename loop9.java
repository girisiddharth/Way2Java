/*Odd Sum
You are given a number N .

Print sum of all odd numbers from 1 to N (inclusive).

Input Format
single line consisting of an integer N.

Output Format
Print the odd Sum.

Example 1
Input

10

Output


25

Explanation


Sum : 1 + 3 + 5 + 7 + 9 = 25 

Example 2
Input


4

Output

4 

Explanation


sum : 1 + 3 = 4

Constraints
1 <= N <= 10^5 */

import java.util.*;
public class loop9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i<=n; i++){
            if (i%2==1){
                sum = sum + i;
            
            }
            
        }
System.out.println(sum);

        }
    }
