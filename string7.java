// Given a string of length N, toggle the case of all the characters in the string, i.e. You should set all lowercase characters to uppercase and vice versa.

// Please note that the string may contain numbers or special characters as well.

// Input Format
// The input consists of two lines.

// The first line of the input contains one integer N, denoting the size of the string.

// The second line of the input contains the string S.

// Output Format
// Your code should output the string S with its characters toggled.

// Example 1
// Input

// 8
// helloABC
// Output

// HELLOabc
// Explanation

// All the lower case alphabets got converted into upper case and vice versa.

// Example 2
// Input

// 4
// aBC1
// Output

// Abc1
// Explanation

// All the lower case alphabets got converted into upper case and vice versa.

// Constraints
// `1 <= N <= 2*10^5``
import java.util.*;
public class string7{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String n = sc.nextLine();
        for (int idx=0;idx<n.length();idx++){

            char ch = n.charAt(idx);

            if (ch>='a' && ch<='z'){

                ch=(char) (ch-32);

            }
            else if (ch>='A' && ch<='Z'){

                ch=(char) (ch+32);
            }
            System.out.print(ch);
        }
       
    }
}