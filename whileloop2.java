/*Odd Numbers
You have to keep taking integers as input until you get an odd number as input. 
Your output will be N, which represents the number of numbers you had to take as
 input uptill encountering an odd number.

Input Format
You will be given N-1 even numbers followed by an odd number.

Output Format
For each test case print the value of N in a new line.

Example 1
Input

4
8
6
10
12
13
Output

6
Explanation

The sixth integer was an odd number.

Example 2
Input

8
13212
332
134
4418
909
Output

6
Explanation

The sixth integer was an odd number.

Constraints
1 <= N <= 100000 */


import java.util.*;
public class whileloop2{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
     int n = 0;
     int count = 0;
     while (n%2==0){
        n = sc.nextInt();
        count++;
     }
     System.out.println(count);
}
}
