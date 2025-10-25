import java.util.*;
public class no5_array {
    public static void main(String[] args) {
        int [] arr = {2,5,6,1,9};
System.out.println(Arrays.toString(arr));

// doing shallow copy 
        int [] num = arr;
        num [0] = 99;
        num [3] = 33;
        System.out.println(Arrays.toString(num));
        //once heap updated by any new varicable it remains same always 
        System.out.println(Arrays.toString(arr));
    }
    
}
