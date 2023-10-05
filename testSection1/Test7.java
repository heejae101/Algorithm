package testSection1;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();

        int lt=0, rt=str.length()-1;
        String result = "YES";
        while (lt<rt){
            if(str.charAt(lt) != str.charAt(rt)) result = "NO";
            lt++;
            rt--;
        }
        System.out.println(result);
    }
}
