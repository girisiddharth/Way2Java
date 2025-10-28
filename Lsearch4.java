/*Given an unsorted integer array of size n.
 Find the last occurrence of a given key.

The key is always present in the array.

Input Format
First line contains two spaced integers 
drepresenting the array size n and key.

Next line contains n-spaced integers representing array a.

Output Format
Print the last index of the key in the array.

Example 1
Input

7 5
8 5 1 4 5 3 2
Output

4
Explanation

According to 0-based indexing, the last occurrence of key 5 is at index 4.

Example 2
Input

7 10
10 1 5 9 8 3 10
Output

6
Explanation

According to 0-based indexing, the last occurrence of key 10 is at index 6.

Constraints
1 <= n <= 10^6

1 <= key <= 10^3

1 <= arr[i] <= 10^3 */


import java.util.*;
public class Lsearch4 {
    public static int findindex(int arr[],int target){
            for (int idx = arr.length-1;idx>=0;idx--){
                if (arr[idx]==target){
                
                return idx;
                }
            }
            return -1;
    }
        
    

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("input the range");
    int n = sc.nextInt();
    int arr [] = new int [n];
    System.out.println("input the value");
    for (int idx = 0;idx <arr.length ;idx++){
          arr[idx] = sc.nextInt();

    }
    System.out.println("input target");
    int target = sc.nextInt();
    int index = findindex(arr,target);
    System.out.println("your"+target+"is on index"+index);

   }
}

