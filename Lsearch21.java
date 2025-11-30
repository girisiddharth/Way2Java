/*Maximum Sum Subarray
Given an array arr of size N. The task is to find the sum of 
the contiguous subarray within a arr with the largest sum.

Input Format
First line consists of an integer n

Second line consists of n spaced integers

Output Format
Print the maximum subarray sum present in the array

Example 1
Input

5
2 3 1 -1 0
Output

6
Explanation

Maximum subarray sum = 2 + 3 + 1

Example 2
Input

8
-2 -3 4 -1 -2 1 5 -3
Output

7
Explanation

Maximum subarray sum = 4-1-2+1+5 */


import java.util.*;
public class Lsearch21{
    public static int nextstep(int arr[]){
      int maxnum =  Integer.MIN_VALUE;
      int count = 0;
    for (int idx=0;idx<arr.length;idx++){
        count = count + arr[idx];
         if (maxnum<count) maxnum = count;
         if (count <0) count =0;
      }
      return maxnum;
    }

    public static void main(String []args){
      Scanner sc =new Scanner(System.in);
      int n = sc.nextInt();
      int arr[]= new int[n];
      for (int idx=0;idx<arr.length;idx++){
        arr[idx] = sc.nextInt();
      }
      
      int ans = nextstep(arr);
      System.out.println(ans);
    }
    

}