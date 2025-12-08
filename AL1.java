import java.util.*;
public class AL1{
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        // System.out.print(list.size());
       
        //  list.add(100);
        //   list.add(200);
        //    list.add(300);
        //     list.add(400);
        //      list.add(500);
        //       list.add(600);
        //        list.add(700);
        //         list.add(800);
        //          list.add(900);
        //           list.add(1000);

       
        // System.out.print(list.size());
        //  System.out.print(list);

        // for (int i =0 ; i<list.size();i++){
        //     System.out.println(list.get(i));
        // }
        // System.out.println(list.get(3));

        // list.add(1,2000);
        // System.out.println(list);

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}