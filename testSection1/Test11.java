package testSection1;

import java.util.HashMap;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int cnt = 0;
        char taget = str.charAt(0);
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(taget == str.charAt(i)){
                cnt++;
            }else{
                result.append(taget);
                if(cnt > 1){
                    result.append(cnt);
                }
                taget = str.charAt(i);
                cnt=1;
            }
        }
        result.append(taget);
        System.out.println(result);

    }
}
