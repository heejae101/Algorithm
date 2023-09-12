package test;

import java.util.HashMap;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        char result = 'U';
        for(int i=0; i<n; i++){
            int answer = sc.nextInt();
            map.put(answer, map.getOrDefault(answer,0)+1);
            if(map.get(answer) > 1){
                result = 'D';
                break;
            }
        }
        System.out.print(result);
    }
}
