package testSection5;

import java.util.Scanner;
import java.util.Stack;

public class Test2 {
    public String solution(String str){
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(x == ')'){
                while (stack.pop() != '(');
            }else stack.add(x);
        }
        for(int i=0; i<stack.size(); i++){
            answer.append(stack.get(i));
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Test2 T = new Test2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
