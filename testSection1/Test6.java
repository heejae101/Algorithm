package testSection1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test6 {

    public String solution(String str){
        StringBuilder result = new StringBuilder();
        Set<Character> chars = new HashSet<>();
//        O(n)
//        for(int i=0; i<str.length(); i++){
//            if(str.indexOf(str.charAt(i)) == i){
//                result.append(str.charAt(i));
//            }
//        }

//        O(n)
        for(char x : str.toCharArray()){
            if(chars.add(x)){
                result.append(x);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Test6 t = new Test6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
