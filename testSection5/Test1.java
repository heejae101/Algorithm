package testSection5;

import java.util.Scanner;
import java.util.Stack;

public class Test1 {

    public String solution(char[] charArray){
        Stack<Character> stack = new Stack<>();
        for(char x : charArray){
            if(x == '('){
                stack.add(x);
            }else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Test1 T = new Test1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str.toCharArray()));
    }
}
