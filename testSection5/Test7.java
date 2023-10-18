package testSection5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test7 {
    public String solution(String needSub, String realSub){
        Queue<Character> queue = new LinkedList<>();
        for(char x : needSub.toCharArray()) queue.offer(x);
        for(char x : realSub.toCharArray()){
            if(queue.contains(x)){
                if(x != queue.poll()) return "NO";
            }
        }
        if(!queue.isEmpty()) return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        Test7 T = new Test7();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(T.solution(str1, str2));
    }
}
