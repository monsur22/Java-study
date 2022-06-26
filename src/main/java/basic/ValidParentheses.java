package basic;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()";

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char st = s.charAt(i);
            if (st == '(' || st == '{' || st == '[') {
                stack.push(st);
            } else {
                if(stack.empty()) {
                    System.out.println(s +" contains invalid parentheses.");
                    return;
                }
                else{
                    char top =  stack.peek();
                    if(st == ')' && top == '(' ||st == '}' && top == '{' ||st == ']' && top == '['){
                        stack.pop();
                    }
                    else{
                        System.out.println(s +" contains invalid parentheses.");
                        return;
                    }
                }
            }
        }
        if(stack.empty()) {
            System.out.println(s +" contains valid parentheses.");
        }
        else{
            System.out.println(s +" contains invalid parentheses.");
        }
    }


}

