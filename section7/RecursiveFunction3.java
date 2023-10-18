package section7;

import java.util.Scanner;

public class RecursiveFunction3 {
    // 팩토리얼
    public int DFS(int n){
        if(n == 1) return 1;
        else return n*DFS(n-1);
    }
    public static void main(String[] args) {
        RecursiveFunction3 T = new RecursiveFunction3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.DFS(n));
    }
}
