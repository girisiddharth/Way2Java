/*Conditional Problem 1
Given an integer n. Your task is to write a program to use
switch case as follows :

if the input number is 28, print i am young.
else print i am not young.
Input Format
First line contains an integer n.

Output Format
Print the statement based on value of n as given above.

Example 1
Input

28
Output

i am young
Example 2
Input

30
Output

i am not young
Constraints
1<=n<=10000
 */


 import java.util.*;
 public class ifelse4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=29){
            System.out.println("i am not young");
        }
        else {
            System.out.println("i am young");
        }
    }
 }