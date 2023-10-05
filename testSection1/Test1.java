package testSection1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        char target = sc.next().toUpperCase().charAt(0);

        int count = 0;
        for(char x : str.toCharArray()){
            if(x == target) count++;
        }
        System.out.println(count);
    }
}
