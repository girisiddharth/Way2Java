/*You are given an integer N.

You are required to write a program that prints numbers from 1 to N

where N is a positive integer provided by the user.

Input Format
single line consisting of an integer N.

Output Format
Print numbers in the range [1 , N].

Example 1
Input


10

Output


1 2 3 4 5 6 7 8 9 10 

Explanation


Print numbers from 1 to 10.

Example 2
Input


8

Output


1 2 3 4 5 6 7 8

Explanation


Print numbers from 1 to 8

Constraints
1 <= n <= 10000 */

import java.util.*;
    public class loop2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=1; i<=a; i++ ){
        System.out.println(i);
}
}
}