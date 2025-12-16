public class string1 {
    public static void main(String[]args){
        String str2 = "hello world";
        String str = new String("hello");
        System.out.print(str +" "+ str2 + str2.length() + " " + str.charAt(4));
        for (int idx=0;idx<str2.length();idx++){
            System.out.println(str2.charAt(idx));
            System.out.println();
        }
        
    }
}
