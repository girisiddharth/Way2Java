/*Days Of A Week
Write a program that takes a number n and displays the name of the weekday,
 if n is >7 print Invalid

Input Format
First line contain a number n

Output Format
Print the name of the weekday. Print Invalid if the number is greater than 7.

Example 1
Input

1
Output

Monday
Example 2
Input

8
Output

Invalid
Constraints
1 <= n <= 10^9 */


import java.util.*;
public class ifelse9{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    if (n==1){
        System.out.println("monday");
    }
     if (n==2){
        System.out.println("tuesday");
    }
 if (n==3){
        System.out.println("wednesday");
    }
 if (n==4){
        System.out.println("thursday");
    }
 if (n==5){
        System.out.println("friday");
    }
 if (n==6){
        System.out.println("saturday");
    }
 if (n==7){
        System.out.println("sunday");
    }
 if (n>7 || n<1){
        System.out.println("invalid construction");
    }


}
}