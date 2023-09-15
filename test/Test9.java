package test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();

        for(char x : word.toCharArray()){
            if((int) x > 90){

            }
        }

        int lt = 0;
        int rt = word.length()-1;
        String result = "NO";

        while (lt <= rt){
            if(word.charAt(lt) == word.charAt(rt)){
                lt++;
                rt--;
            }else break;
        }

        if(lt == rt){
            result = "YES";
        }else{
            System.out.println(lt);
            System.out.println(rt);
        }

        System.out.println(result);
    }
}
