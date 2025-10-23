    /*Lily wants to enter a positive integer and increase 
    its value by 5 using for loop.

    She wants to increase the value in fun function 
    & print the result in the caller function.

    Help Lily by writing a program for the same.

    Input Format
    First line contains an integer n

    Output Format
    Output will be (n+5)

    Example 1
    Input

    15
    Output

    20
    Explanation

    The value is increased by 5 so 15+5 becomes 20

    Example 2
    Input

    10
    Output

    15
    Explanation */

    import java.util.*;
    public class functions7 {

         public static int fun(int a){
            int b = a;
            for (int i = 1; i <=5;i++)
             b = b+1;
return b;
         }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int result = fun(a);
        System.out.println(result);
    }
    }
