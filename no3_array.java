import java.util.*;
public class no3_array {
    public static void main (String[]args){
        //without putting value output : [0,0,0,0,0]
        int [] arr = new int[5];
        System.out.println(Arrays.toString(arr));
        //after putting the data output will be; [30,40,50,60,70] you can put any value you want to 
        arr [0] = 30;
        arr [1] = 40;
        arr [2] = 50;
        arr [3] = 60;
        arr [4] = 70;
        System.out.println(Arrays.toString(arr));
        //to print specific one 
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
       
        //putting value direct in array 
   for (int i = 0; i<=arr.length;i++){
                arr[i]=i+1;
 //same work in short by using for loop(traversal)
        for (int index=0;index<arr.length;index++){
            System.out.println(arr[index]);

            
            
            }
        }
        
    }
    
}
