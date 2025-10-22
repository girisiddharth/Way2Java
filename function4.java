/*Given n and r, your task is to calculate nCr.

Here nCr is the total number of ways for selecting r 
elements out of n options are nCr = (n!) / (r! * (n-r)!) 
 where n! = 1 * 2 * . . . * n.

Input Format
Input consists of one line having two integers n followed by r.

Output Format
You have to calculate nCr using the formula as given and 
return the value to the main function.

Example 1
Input

5 2
Output

10
Example 2
Input

3 1
Output

3 */
import java.util.*;
public class function4 {

static long factorial(int n){
    long fact = 1;
    for (int i = 1; i <= n; i++){
        fact = fact*i;


    }
    return fact;

}


    static long ncr(int n, int r){
        long first = factorial(n);
        long second = factorial(r);
        long third = factorial(n-r);

        long ans = first/(second * third);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        long ans = ncr(n, r);
        System.out.println(ans);
    }
    
}
