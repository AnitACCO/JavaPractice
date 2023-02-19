import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateElementsList {
    public static void main(String[] args) {
        List<String> li = new ArrayList<String>();
        li.add("Anit");
        li.add("Aman");
        li.add("Om");
        li.add("Aditya");
        li.add("Hrushikesh");
        li.add("Aman");
        li.add("Om");
        HashMap map = new HashMap<String,Integer>();
        for(String st:li){
            if(!map.containsKey(st)){
                map.put(st,1);
            }
            else{
                map.put(st,2);
                System.out.println(st);
            }
        }

    }
}
