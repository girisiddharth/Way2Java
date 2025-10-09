/*armstrong number */
import java.util.*;
import java.math.*;
public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = n;
        while (i>0){
            int rem = i%10;
            count =  rem*rem*rem+count;
            i=i/10;
        
        }
         
        if (count==n){
            System.out.println("its an armstrong");
         }
         else {
            System.out.println("its not an armstrong");
         }
         
    }
}
