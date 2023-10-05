package testSection1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(char x : str.toCharArray()){
            if((int) x >= 97 && (int) x <= 122) System.out.print((char)(x-32));
            else System.out.print((char)(x+32));
        }
    }
}
