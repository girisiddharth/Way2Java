/*Number of Days
Given the number of the month, your task is to calculate the number of days 
present in the particular month.

Note:- Consider non-leap year.

Input Format
An integer M, denoting the number of the month.

Output Format
Return the number of days in the month corresponding to the given number. 
Consider a non-leap year.

Example 1
Input

1
Output

31
Explanation

January has 31 days.

Example 2
Input

3
Output

31
Explanation

March has 31 days.

Constraints
1 <= M <= 12 */


import java.util.*;
public class ifelse10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m==1){
         System.out.println("31");
        }
        if (m==2){
         System.out.println("28");
        }
        if (m==3){
         System.out.println("31");
        }
        if (m==4){
         System.out.println("30");
        }
        if (m==5){
         System.out.println("31");
        }
    
    if (m==6){
         System.out.println("30");
        }
        if (m==7){
         System.out.println("31");
        }
        if (m==8){
         System.out.println("31");
        }
        if (m==9){
         System.out.println("30");
        }
        if (m==10){
         System.out.println("31");
        }
        if (m==11){
         System.out.println("30");
        }
        if (m==12){
         System.out.println("31");
        }
        if (m > 12 || m < 1){
            System.out.println("invalid input");
        }
    }
}

