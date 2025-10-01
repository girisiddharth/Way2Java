    /*Given an integer n, print a pattern of n lines, where the ith line has the numbers i to 1 printed in descending order. Check the sample cases for a better understanding.

Input Format:
Input consists of an integer N.

Output Format:
Print the pattern as described above.

Example 1
Input:

5
Output:

Pattern Image

Example 2
Input:

3
Output::

Pattern Image */
import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        sc.close();
        for (int i = 1;i<=n;i++){
            int num = i;
            for (int j = 1;j<=i;j++){
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
    
}
