import java.util.*;
public class no7_array {
    public static void swap(int [] arr,int i,int j){
        int num =  arr [j];
        arr [j] = arr [i];
        arr [i] = num;

    }
    public static void main(String[] args) {
        int [] arr = new int [5];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        arr [3] = 4;
        arr [4] = 5;

        System.out.println("before swapping :"+Arrays.toString(arr));
        swap (arr, 1,2);
        System.out.println("After swapping :"+Arrays.toString(arr));

    }
}
