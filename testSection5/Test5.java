package testSection5;

import java.util.Scanner;
import java.util.Stack;

public class Test5 {
    public int solution(String str){
        Stack<Character> stack = new Stack<>();
        int result = 0;
        int chk = 0;
        for(char x : str.toCharArray()){
            if(x == '('){
                chk = 0;
                stack.add(x);
            }
            else{
                if(chk == 1){
                    result += 1;
                    stack.pop();
                    chk = 0;
                }else{
                    chk = 1;
                    stack.pop();
                    result += stack.size();
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Test5 T = new Test5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
