/*Array Operations
Given an array arr of size n, Write a program to find the below 3 values.

Sum of all the elements in the array.

Average of all the elements in the array (Give the floor value).

Maximum element in the array.

Input Format:
First line contains n representing the number of elements.

Next line contains n space-separated integers, representing elements of the array arr.

Output Format:
In a single line print 3 space-separated integers representing Sum, 
Average and Maximum among all the array elements.

Example 1
Input

6
1 2 3 4 5 6
Output

21 3 6
Explanation:

The sum of all the elements of the array 1+2+3+4+5+6 is 21, the average 
(1+2+3+4+5+6)/6 is 3, and the maximum among all of them is 6.

Example 2
Input

5
1 0 -1 0 0
Output:

0 0 1
Explanation:

The sum of all the elements of the array 1+0+(-1)+0+0 is 0, the average
 (1+0+(-1)+0+)/5 is 0, and the maximum among all of them is 1 */

 import java.util.*;
 public class Lsearch5 {
    public static int nextnumber(int []arr,int n){
        int sum = 0;
        int avg = 0;
        int max = 0;
        // int max = Integer.MIN_VALUE;
        
        for (int idx = 0;idx<n;idx++){
            sum = sum+arr[idx];
            max = Math.max(arr[idx], max);
            }
            
        
        avg = sum/n;
            System.out.println("sum"+sum);
            System.out.println("avg" + avg);
            System.out.println("min"+max);
            return 0; 
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("input length");
        int n = sc.nextInt();
        int arr [] = new int [n];
        System.out.println("input values");
        for (int idx =0;idx<arr.length;idx++){
            arr[idx] = sc.nextInt();
        }
        nextnumber(arr,n);
         

    }

 }
