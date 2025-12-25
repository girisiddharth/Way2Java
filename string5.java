public class string5 {
    public static void main(String[]args){
         String str = "abc def ghi jkl";
        String split[] = str.split(" ");
        for (int idx=0;idx<split.length;idx++){
            System.out.println(split[idx]);
            
        }
    }
}
