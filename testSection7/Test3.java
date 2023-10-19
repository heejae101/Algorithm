package testSection7;

import java.util.Scanner;

public class Test3 {
    // 팩토리얼
    public int BFS(int n){
        if(n==1) return 1;
        else return n*BFS(n-1);

    }

    public static void main(String[] args) {
        Test3 T = new Test3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(T.BFS(n));
    }
}
