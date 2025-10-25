import java.util.*;
public class no6_array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
System.out.println(Arrays.toString(arr));
        int [] num = new int[arr.length];
        for (int index=0;index<arr.length;index++){
            num[index] = arr[index];
            
        }
        num [0] = 99;
        num [3] = 33;
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(arr));
        }
}

//it is deep copy in which even you change value in one variable other will not change