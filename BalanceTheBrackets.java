import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BalanceTheBrackets {
    public static void main(String[] args) {
        String input = "(3*(3+1)-3*2+1=19";
        //String input = "(8+2)*(2-1=10";
        //(3 * (3 + 1) - 3  * 2 + 1 = 19
        //sym (*(+
        //cal 3,3,1
        input = balanceTheEq(input);
        System.out.println(input);
    }
    public  static String  balanceTheEq(String input) {
        //TODO Add your implementation here
        int t = 1;
        int count = 0;
        int p_count = 0;
        int flag = 1;
        List<Integer> poss = new ArrayList<Integer>();
        int result = 0;
        for(int i = input.length()-1; input.charAt(i) != '='; i--){
            int temp = Character.getNumericValue(input.charAt(i));
            temp = temp*t;
            result = temp + result;
            t = t*10;
        }
        int i = 0;
        do {
            if(count >= 2  && p_count==1 && flag == 1 && input.charAt(i) != ')' && input.charAt(i) != '-'
                    && input.charAt(i) != '-'){
                poss.add(i);

            }
            if(input.charAt(i) == '('){
                p_count = p_count + 1;
            }
            if(input.charAt(i) == ')') {
                p_count = p_count - 1;
                if(p_count == 0){
                    count = 0;
                }
            }
            if(Character.isDigit(input.charAt(i)) && p_count > 0){
                count = count + 1;
                flag = 1;
            }
            if(IsOperator(input.charAt(i))){
                flag = 0;
            }
            i++;
        }while(input.charAt(i-1) != '=');
        if (poss.size() == 1) {
            int temp = poss.get(0);
            //input.charAt(temp) = ')';
            input = input.substring(0, temp) + ')' + input.substring(temp);
            return input;
        }
        else{
            for(Integer k:poss){
                Stack<Character> stck = new Stack<Character>();
                String input1 = input.substring(0, k) + ')' + input.substring(k);
                input = input1;
                return input;
            }
        }
        return input;
    }


    static boolean IsOperator(char ch){
        if(ch == '*' ||ch == '/' ||ch == '-' || ch == '+' ){
            return true;
        }
        return false;
    }

}
