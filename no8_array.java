import java.util.*;
public class no8_array {

    public static void swap (int [] arr, int i,int j){
        int [] number = Arrays.copyOf(arr,arr.length);
        int swap = number[i];
        number[i] = number[j];
        number [j] = swap;
        System.out.println(Arrays.toString(number));
    }
        
    
    public static void main(String[] args) {
        int [] arr = new int [5];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        arr [3] = 4;
        arr [4] = 5;
        System.out.println(Arrays.toString(arr));
        swap (arr, 1,2);
        System.out.println(Arrays.toString(arr));
    }
}
