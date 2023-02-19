import java.util.*;

public class Main
{
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(3,"Apple");
        map.put(4,"Banana");
        map.put(2,"Grapes"); //trying duplicate key

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
