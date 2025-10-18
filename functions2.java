import java.util.*;
public class functions2{

    public static void factorial(int n){
        int fact = 1;
        int i = 1;
        while (i<=n){
            fact = fact*i;
            i++;
        }
        System.out.println(fact);
    }
public static void main(String[] args) {
           Scanner sc = new Scanner (System.in);
           int n = sc.nextInt();
           System.out.println("your factorial is " + n);
           factorial(n);
    }
}