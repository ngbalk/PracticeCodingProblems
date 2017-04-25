import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by nbalkiss on 4/10/17.
 */
public class BalancedBraces {
    public static boolean isBalanced(String s){
        List<String> open = Arrays.asList("{","[","(");
        List<String> closed = Arrays.asList("}","]",")");
        Stack<String> stk = new Stack<String>();
        for(String el : s.split("")){
            if(open.contains(el)){
                stk.push(el);
                continue;
            }
            if(closed.contains(el)){
                String innermost = stk.pop();
                if(!closed.get(open.indexOf(innermost)).equals(el)){
                    return false;
                }
            }

        }
        return stk.size()==0;
    }

}
