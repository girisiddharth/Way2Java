/*Array Problem 1
Ruma has given an array arr to Sima such that it consists of n elements.

Ruma asks Sima to write a program to find out the index of the largest element
 in present in the array and print the index.

Your task is to help Sima by writing a program.

NOTE: Output should be in zero based indexing. If there are multiple 
occurences of the largest number, return the smallest index.

Input Format:
Line 1: Contains an integer 'n' indicating number of elements in array.

Line 2: Contains 'n' space-seprated integer indicating elements in the array.

Output Format:
Return an integer such that it is the index of largest element in array.

Example 1
Input

5
1 2 3 4 5
Output

4
Explanation

The largest number in the array is 5, Zero-based indexing for 5 would be 4.

Example 2
Input

10
1 2 7 4 10 6 5 8 3 9
Output

4
Explanation

The largest number in the array is 10, Zero-based indexing for 10 would be 4.

Constraints
0 <= n <= 10^6
-10^9 <= arr[i] <= 10^9 */

import java.util.*;
public class Lsearch6 {
    public static int nextstep(int arr[],int n ){
        int max = arr[0];
        int index = 0;
           for (int idx = 1 ; idx<arr.length;idx++){
               if (arr[idx]>max){
                max = arr[idx];
                index = idx;
                
               }
               
           }   
            return index;
    }
   
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("input size");
    int n = sc.nextInt();
    int arr[] = new int [n];
    System.out.println("input value");
    for (int idx = 0;idx<arr.length;idx++){
        arr[idx]= sc.nextInt();
    }
    int ans = nextstep(arr,n);
    System.out.println("your largest number is on index " + ans);
    

}
    
    }

