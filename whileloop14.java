/*Print A to Z
You are required to write a program that prints Upper-Case Characters from A to Z

Input Format
No input required

Output Format
Print A to Z

Example 1
Input


No input required

Output


A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 

Explanation


Print A to Z. */



import java.util.*;
public class whileloop14{
    public static void main(String[] args) {
        char a = 'A';
        char b = 'Z';
        for (char i=a; i<=b;i++){
        System.out.println(i);
        } 
    }
}