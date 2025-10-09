/* n=4
 A
 BB
 CCC
 DDDD
 */


import java.util.*;
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1;row<=n;row++){
           
            
            for (int col = 1;col<=row;col++){
                 char ch = (char)('A'+(row-1));
                System.out.print(ch);
            
            if (ch=='Z'){
                ch='A';
            }
            
            }
            System.out.println();
        }
    }
}
