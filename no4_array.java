import java.util.*;
public class no4_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int [] nums = new int [n];
        for (int put = 0; put<nums.length;put++){
            nums[put]= sc.nextInt(); 
        }
        System.out.println(Arrays.toString(nums));
       
    }
}
