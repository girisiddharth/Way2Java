/*You have given a number n1, representing the size of array arr1. 
You have given n1 numbers, representing elements of array arr1. 
You have given a number n2, representing the size of array arr2.
You have given n2 numbers, representing elements of array arr2. 
The two arrays represent the digits of two numbers.

You are required to add the numbers represented by two arrays and 
return the resultant arrays. n1 and n2 are of diferent size

Input Format
First line consists of an integer n1

Second line consists of n1 spaced integers, representing elements of arr1

Third line consists of an integer n2

Fourth line consists of n2 spaced integers, representing elements of arr2

Output Format
Add the two numbers and return the resultant array

Example 1
Input

3
1 2 3
3
3 2 1
Output

4
4
4
Explanation

Adding corresponding elements gives 4 at each index -> 1 + 3 = 2 + 2 = 3 + 1 = 4

Example 2
Input

2
2 1
4
1 2 3 4
Output

1
2
5
5
Explanation

1234 + 21 = 1255

Constraints
0 <= a1[i], a2[i] < 10 */

import java.util.Scanner;

public class Lsearch11 {
    
    
    public static int[] nextstep(int a[], int b[], int n, int m) {
        int[] ans = new int[Math.max(n, m)];
        
        int i = n - 1; 
        int j = m - 1; 
        int k = ans.length - 1; 
        int carry = 0;

        while (k >= 0) { 
            int dig = carry;

            if (i >= 0) {
                dig += a[i];
            }

            if (j >= 0) {
                dig += b[j];
            }
            
            ans[k] = dig % 10;
            carry = dig / 10;

            i--;
            j--;
            k--; 
        } 
        
        if (carry == 0) {
            return ans;
        } else {
            int[] res = new int[ans.length + 1];
            res[0] = carry;
            
            for (int idx = 0; idx < ans.length; idx++) {
                res[idx + 1] = ans[idx];
            }
            return res;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr1[idx] = sc.nextInt();
        }

       
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int idx = 0; idx < m; idx++) {
            arr2[idx] = sc.nextInt();
        }
        
        sc.close(); 

        
        int[] answerArray = nextstep(arr1, arr2, n, m);
        
        
        for (int digit : answerArray) {
            System.out.println(digit);
        }
    }
}