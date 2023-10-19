package testSection7;

import java.util.Scanner;

public class Test2 {
    // 10진수 2진수로 바꾸기
    public void BFS(int n){
        if(n==0) return;
        else{
            BFS(n/2);
            System.out.print(n%2+" ");
        }
    }

    public static void main(String[] args) {
        Test2 T = new Test2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        T.BFS(n);
    }
}
