package testSection1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.next();
        }
//        O(n)
//        for(String x : arr){
//            for(int i=x.length()-1; i>=0; i--){
//                System.out.print(x.charAt(i));
//            }
//            System.out.println();
//        }
        for(String x : arr){
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while (lt < rt){
                char temp = s[rt];
                s[rt] = s[lt];
                s[lt] = temp;
                lt++;
                rt--;
            }
            System.out.println(String.valueOf(s));
        }
    }
}
