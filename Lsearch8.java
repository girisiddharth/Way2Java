/*Write a program to find out the difference between 
sum of all the elements in two arrays arr1 and arr2.
If sum of all elements in arr1 is larger then, 
the output should be First array is larger,
if sum of all elements in arr2 is larger then, 
the output should be Second array is larger,
otherwise the output should be Both are equal.

Input Format
First line contains n, size of the first array.

Second line contains n elements of the first array.

Third line contains m, size of the second array.

Fourth line contains m elements of the second array.

n and m will always be equal.

Output Format
Print the output as per difference.

Example 1
Input

2
1 2
2
3 4
Output

Second array is larger
Explanation

Overall sum of first array is 1+2 = 3
Overall sum of second array is 3+4 = 7
Thus, second array is larger

Example 2
Input

3
1 2 10
3
3 4 1
Output

First array is larger
Explanation

Overall sum of first array is 1+2+10 = 13
Overall sum of second array is 3+4+1 = 8
Thus, first array is larger

Example 3
Input

2
1 3
2
2 2
Output

Both are equal
Explanation

The overall sum of the first array is 1+3 = 4
The overall sum of the second array is 2+2 = 4
Thus, both are equal

Constraints
n = m
1 <= n <= 10^6
-10^6 <= arr1[i],arr2[i] <= 10^6 */


import java.util.*;
public class Lsearch8 {
    public static void nextstep(int arr1[],int arr2[],int n,int m){
        int add1 = 0;
        int add2 = 0;
        for (int idx=0;idx<arr1.length;idx++){
             add1 = add1+arr1[idx];
        }
        for (int idx=0;idx<arr2.length;idx++){
            add2 = add2+arr2[idx];
        }
        if (add1<add2){
            System.out.println("second array is larger");
        }
        else if (add1>add2){
            System.out.println("first array is larger");
        }
        else {
            System.out.println("both are equal");
        }
        
    }

public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("input arr1 range");
     int n = sc.nextInt();
     System.out.println("input arr2 range");
     int m = sc.nextInt(); 
     int arr1[] = new int [n];
     
     int arr2[] = new int[m];
     System.out.println("put input for arr1");
     for (int idx = 0;idx<arr1.length;idx++){
          arr1[idx] = sc.nextInt();
        
     }
     System.out.println("put input for arr2");
     for (int idx = 0;idx<arr1.length;idx++){
          
        arr2[idx] = sc.nextInt();
     }
     nextstep(arr1,arr2,n,m);

}


    
}