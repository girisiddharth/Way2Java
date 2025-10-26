import java.util.*;
public class Lsearch2 {

    public static int linearsearch(int [] arr,int target){
        for (int idx = arr.length-1; idx >=0;idx-- ){
            if (arr[idx]==target){
                return idx;

            }
        }
        return -1;
    }
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("put size");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("put value");
        for (int idx = 0; idx<arr.length;idx++){
            
            arr[idx] = sc.nextInt();
        }
        System.out.println("put the target");
            int target = sc.nextInt();
        int index = linearsearch(arr,target);
        if (index == -1){
            System.out.println("not found");
        }
        else{ 
            System.out.println("index of "+ target + " is "+ index);
        }
        }
    
    }

    



