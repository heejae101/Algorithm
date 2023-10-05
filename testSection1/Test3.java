package testSection1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        int max = 0;
        String result = null;
        for(String x : arr){
            int cnt = x.length();
            if(cnt > max){
                max = cnt;
                result = x;
            }
        }
        System.out.print(result);
    }
}
