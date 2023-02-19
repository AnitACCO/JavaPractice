import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "ramnaga";
        String str2 = "anagram";
        HashMap<Character,Integer> map1=new HashMap();
        HashMap<Character, Integer> map2=new HashMap();
        if(str1.length() == str2.length()){
            for(int i = 0;i < str1.length();i++){
                if(!map1.containsKey(str1.charAt(i))){
                    map1.put(str1.charAt(i),1);
                }
                else{
                    int t = map1.get(str1.charAt(i));
                    map1.put(str1.charAt(i),t+1);
                }
                if(!map2.containsKey(str2.charAt(i))){
                    map2.put(str2.charAt(i),1);
                }
                else{
                    int t = map2.get(str2.charAt(i));
                    map2.put(str2.charAt(i),t+1);
                }
            }
            if(map1.equals(map2)){
                System.out.println("Strings Are Anagram");
            }
            else{
                System.out.println("Strings Are Not Anagram");
            }
            System.out.println(map1);
            System.out.println(map2);
        }
        else{
            System.out.println("Strings are not Anagram");
        }


    }
}
