package testSection1;

import java.util.Scanner;

public class Test8 {
    public  String solution(String str){
        String result = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) result = "YES";
        return result;
    }
    public static void main(String[] args) {
        Test8 t = new Test8();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
