public class Practise {
    public static void main(String[] args) {
        String Str1 = new String("marker");
        String Str2 = "marker";
        String str3 = Str1.concat("500");
        String str4 = str3.intern();
        System.out.println(str3==str4);
        System.out.println(str3);
    }
}
