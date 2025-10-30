/*Write a program to count the elements in an array which are greater than 35.

Input Format:
First line contains n, the size of an array.

Next line contains n-spaced integers representing array arr.

Output Format:
Print the number of the elements present in the array which are greater than 35.

Example 1
Input

5
12 67 89 16 23
Output

2
Explanation

67 and 89 are greater than 35. Hence, the output is 2.

Example 2
Input

4
22 39 45 72
Output

3
Explanation

39, 45, and 72 are greater than 35. Hence, the output is 3.

Constraints
1 <= n <= 10^6

1 <= arr[i] <= 10^6 */

import java.util.*;
public class Lsearch7 {
    public static int nextstep(int []arr,int n){
         int num = 35;
         int count = 0;
         for (int idx=0;idx<arr.length;idx++){
            if (arr[idx]>num){
                count++;
            }
         }
         return count;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("input range");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("input data");
    for (int idx = 0;idx<arr.length;idx++){
       arr[idx]=sc.nextInt();
        }
        int ans = nextstep(arr,n);
        System.out.println(ans);
}
    
}
