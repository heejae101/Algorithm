package testSection5;

import java.util.Scanner;
import java.util.Stack;

public class Test4 {
    public int solution(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)){
                stack.add(x-48);
            }else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt+rt);
                else if(x == '-') stack.push(lt-rt);
                else if(x == '*') stack.push(lt*rt);
                else if(x == '/') stack.push(lt/rt);
            }
        }
        answer = stack.pop();
        return answer;
    }
    public static void main(String[] args) {
        Test4 T = new Test4();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
