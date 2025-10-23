/*Given a positive integer N. The task is to Create a
 function and return true or false according to the condition
  that whether zero is present at the second last place value or not.

You have to print the output in the calling 

function itself based on the boolean value you get in return from the function.

The output should be Yes or No.

Input Format
Input consists of a single line of integer n.

Output Format
Print Yes if the second last place value is 0 else No.

EXAMPLE 1
Input:

100
Output::

Yes
EXPLANATION:

0 is it's second last digit.

EXAMPLE 2
Input:

11
Output::

No */
import java.util.*;
public class functions10 {
public static boolean lastdigit (int n){
    int lastseconddigit = n/10;
    int lastsec = lastseconddigit % 10;
    return lastsec == 0;
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        boolean res = lastdigit(n);
        if (res){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        }
    }

