package 算法题;

import java.util.Stack;

public class Main8 {
    public static void main(String[] args) {
        String s = "()(()()";
        System.out.println(chkParenthesis(s, s.length()));
    }
    public static boolean chkParenthesis(String A, int n) {
        // write code here
        if (A.charAt(0)==')') return false;
        Stack<Character> stack = new Stack<>();
        stack.push(A.charAt(0));
        for (int i = 1; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch=='('){
                stack.push(ch);
            }else if (ch==')'){
                if (stack.isEmpty()) return false;
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
