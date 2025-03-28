// Valid Parentheses
import java.util.*;
public class problem20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isValid(s));
        sc.close();
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if(!isMatch(top, c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    private static boolean isMatch(char open, char close){
        return (open=='(' && close==')') || (open=='{' && close=='}') || (open=='[' && close==']');
    }

}