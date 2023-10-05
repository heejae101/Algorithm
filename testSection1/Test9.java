package testSection1;

import java.util.Scanner;

public class Test9 {
    public int solution(String str){
        StringBuilder s = new StringBuilder();
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) s.append(x);
        }
        return Integer.parseInt(s.toString());
    }
    public static void main(String[] args) {
        Test9 t = new Test9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
