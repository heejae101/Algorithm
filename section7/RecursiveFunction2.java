package section7;

import java.util.Scanner;

public class RecursiveFunction2 {

    // 10진수를 2진수로 구하기
    public void BFS(int n){
        if( n==0 ) return;
        else {
//            int m = n%2;
//            n = n/2;
            BFS(n/2);
            System.out.print(n%2+" ");
        }
    }
    public static void main(String[] args) {
        RecursiveFunction2 T = new RecursiveFunction2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.BFS(n);
    }
}
