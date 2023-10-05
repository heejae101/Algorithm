package testSection1;

import testSection6.Test;

import java.util.Scanner;

public class Test5 {

    public String solution(String str){
        char[] arr = str.toCharArray();
        int lt = 0, rt = str.length()-1;
        while (lt < rt){
            if(Character.isLetter(arr[lt])){
                char temp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = temp;
            }
            lt++;
            rt--;
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        Test5 t = new Test5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
