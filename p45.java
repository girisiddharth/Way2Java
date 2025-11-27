import java.util.*;

public class p45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orignal = n;
        int reversed=0;
        while (n>0){
            int digit = n%10;
            reversed = reversed*10+digit;
            n = n/10;
        }

        
        if (orignal == reversed){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
