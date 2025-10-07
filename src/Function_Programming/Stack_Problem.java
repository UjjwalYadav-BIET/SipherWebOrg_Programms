package Function_Programming;

import java.util.Stack;

/* 1. You are given a string expression, assume that the expression is balance that if the opening and closing bracket match with each other.
 But some of the pair of bracket may be extra / needed you are required to print true if you detect extra bracket and false otherwise.
 Ex= ((a+b) + (c-d)) -> false
 Ex= (a+b) + ((c-d)) -> true */
public class Stack_Problem {
    public static boolean hasExtraBrackets(String expr){
        Stack<Character> st = new Stack<>(); // Syntax to create the stack in java.....
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == ')') {
                boolean operatorFound = false;
                while (!st.isEmpty() && st.peek() != '(') {
                    char top = st.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/' || top == '^') {
                        operatorFound = true;
                    }
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
                if (!operatorFound) return true;
            } else if (ch != ' ') {
                st.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "((a+b) + (c-d))";
        String s2 = "(a+b) + ((c-d))";
        System.out.println(s1 + " -> " + hasExtraBrackets(s1)); // expected: false
        System.out.println(s2 + " -> " + hasExtraBrackets(s2)); // expected: true
    }
}
