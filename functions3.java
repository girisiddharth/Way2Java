import java.util.*;
public class functions3 {

    public static void swap(int a,int b){
        int c = a;
         a = b;
         b = c;
     System.out.println("a="+ a);
     System.out.println("b="+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);

    }
}
