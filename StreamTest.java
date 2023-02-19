import java.util.*;

public class StreamTest {
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>(Arrays.asList(2,5,8,9,16,10));
        //li.stream().forEach(p -> System.out.println(p));
        li.stream().filter(x -> ((x%2) == 0)).map(y->y*2);
        System.out.println(li);
        //sti = sti.map(x -> x*2);

    }
}
