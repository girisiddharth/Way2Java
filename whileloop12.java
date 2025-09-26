/*AS Loops Problem 1
Write a program to enter numbers till the user wants and in the end the program should print 
the largest and smallest numbers.

Input Format
Enter input of a number from user

Next ask user if they want to enter another number or not

If user says yes(y/Y) then enter number again but if the user says no(n/N) then simply stop

Output Format
Print the largest number in line 1 and smallest number in line 2 as shown in sample test cases

Example 1
Input

10
y
5
Y
100
y
256
n
Output

Largest number: 256
Smallest number: 5
Example 2
Input

98
y
2341
Y
-21
N
Output

Largest number: 2341
Smallest number: -21 */



import java.util.*;

public class whileloop12 {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        char choice;
        
        do {
            int num = sc.nextInt();
            
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    
        
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
