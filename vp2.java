/*Variable Practice Question 5
Imagine you're working on an e-commerce site and you need to calculate the
 average rating for a product. The ratings are stored as floating 
 point numbers in a MongoDB database. For this task, you can simulate 
 the ratings with three variables rating1, rating2, and rating3, which 
 should be initialized with the values 10.5, 12.5, and 12.15 respectively. 
 Write a JavaScript function calculateAverageRating that calculates the average
 rating and returns the floored integer value.

There is no input for this task. The function should return the floored 
integer average value. For example, given the above ratings, the function
 should return 11." Note

In JavaScript, you can use the Math.floor() function to get the floored 
integer value.

Input Format
There is no input for this question

Output Format
Print the floored integer average value.

Example 1
Input

No input
Output

11
Topics
Basics*/

import java.util.*;

public class vp2 {

         public static void main (String[]args){
  float rating1= 10.5f;
  float  rating2= 12.5f;
  float  rating3= 12.15f;

  float  avg = (rating1+rating2+rating3)/3;

  System.out.println((int)avg);
         }
    }
