package testSection1;

import java.util.Arrays;
import java.util.Scanner;

public class Test10 {

    public void solution(String str, char taget){
        int[] result = new int[str.length()];
        int p = 0;
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == taget){
                p=0;
                result[i] = p;
            }else {
                p++;
                result[i]=p;
            }
        }
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) == taget){
                p=0;
                result[i] = p;
            }else{
                p++;
                result[i] = Math.min(result[i],p);
            }
        }

        System.out.print(Arrays.toString(result));
    }
    public static void main(String[] args) {
        Test10 t = new Test10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char taget = sc.next().charAt(0);
        t.solution(str, taget);
    }
}
