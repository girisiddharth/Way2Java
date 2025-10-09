/* optimus prime number */
import java.util.*;
public class nestedloop{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int start = 2;
    while (start <=n){
        int work = 2;
        int count = 0;
        while (work<=start/2){
            if (start%work==0){
               count ++;
            }
        
        work++;
            

        }
        if (count==0){
            System.out.println(start);
        }
        start++;
    }
}
}