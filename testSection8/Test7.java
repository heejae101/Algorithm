package testSection8;

import java.util.Scanner;

public class Test7 {

    static int[][] ch = new int[35][35];
    public int DFS(int n, int r){
        if(ch[n][r]>0) return ch[n][r];
        if(n==r || r==0) return 1;
        else return ch[n][r] = DFS(n-1,r-1) + DFS(n-1,r);
    }
    public static void main(String[] args) {
        Test7 T = new Test7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n,r));
    }
}
