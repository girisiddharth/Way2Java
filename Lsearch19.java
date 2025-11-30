/*Subarray sum divisible by k
Given an integer array nums and an integer k, print the number of non-empty 
subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

Input Format
Input consists of two lines.

The first line contains two integers n (size of the array) and k.

The second line contains n spaced integers.

Output Format
Print count of subarrays divisible by k

Example 1
Input

6 5 
4 5 0 -2 -3 1
Output

7
Explanation

There are 7 subarrays with a sum divisible by k = 5:

[4, 5, 0, -2, -3, 1]

[5]

[5, 0]

[5, 0, -2, -3]

[0]

[0, -2, -3]

[-2, -3]

Example 2
Input

4 2 
4 5 0 -2
Output

4
Explanation

There are 4 subarrays with a sum divisible by k = 2:

[4]

[0]

[0 -2]

[-2]

Constraints
1 <= nums.length <= 5 * 10^3

-10^4 <= nums[i] <= 10^4

2 <= k <= 10^4 */

import java.util.*;
public class Lsearch19{
    public static void nextstep(int arr[],int n ,int target){
        int count =0;
        for (int i =0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr.length;j++){
                sum += arr[j];
                if (sum%target==0){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for (int idx=0;idx<arr.length;idx++){
            arr[idx]  = sc.nextInt();
        }
        int target = sc.nextInt();
        nextstep(arr,n,target);
    }
}