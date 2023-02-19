import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<Integer>();
        li = Arrays.asList(2,1,3,5,9,6,7);
        int k = 9;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i:li){
            if( map.containsKey(i)){
                count = count + 1;
            }
            else{
                map.put(k-i,i);
            }
        }
        System.out.println(count);
    }
}
