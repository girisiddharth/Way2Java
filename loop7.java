/*Do you like this question ?
Question
easy
Max Score: 30
Print Sum 10
Write a program to calculate the sum of first 10 natural number.

Input Format
No input.

Output Format
Print the sum of first 10 natural number.

Example 1
Input

No input
Output

55
Explanation

1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
Constraints
None */


import java.util.*;
public class loop7{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
     
    int sum= 0;
    for( int i = 1; i <=10 ; i++){
         sum = i+sum;
    }
    System.out.println(sum);
}
}