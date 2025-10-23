/* You have given a string name of user. 
The user gives his name as to you and your task is to return string 
"name" is a Super Hero.

You have to complete ModifyName function which consists of 
single string name as input and return the string as 
mentioned above as output

Input Format
The first line of input contains a string.

Output Format
Print "name" is a Super Hero

Example 1
Input

Accio
Output

Accio is a Super Hero */

import java.util.*;
public class functions8{
    public static String modified(String name){
        System.out.println(name + " is a super hero");

        return name;
    }
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner (System.in);
String name = sc.nextLine();
 modified(name);     
}
}