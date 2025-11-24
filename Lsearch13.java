/*2nd Largest from array
Given an unsorted array of size N find the 2nd largest
 element from the array without sorting the array.

Input Format
The first line contains a single integer N.

The second line consists of N integers of the array.

Output Format
Print the second largest number in the new line.

Example 1
Input

6
3 2 1 5 6 4
Output

5
Explanation

5 is the second largest element of the array.

Example 2
Input

9
10 1 7 2 5 6 8 9 3
Output

9
Explanation

9 is the Second largest element in the array

Constraints:
2 <= N <= 10^5

-10^5 <= N <= 10^5 */

import java.util.*;
public class Lsearch13 {
    public static void nextstep(int[] arr,int n){
          int max = Integer.MIN_VALUE;
          int smax = Integer.MIN_VALUE;
          for (int idx=0;idx<arr.length;idx++){
            if (arr[idx]>max){
                smax = max;
                max = arr[idx];
            }
            else if (arr[idx]>smax && arr[idx]!=max){
                smax = arr[idx];
            }
          }
          System.out.println(smax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int idx=0;idx<arr.length;idx++){
            arr[idx] = sc.nextInt();
        }
        nextstep(arr,n);
    }
}