package testSection7;

import java.util.Scanner;

public class Test4 {

    static int[] fibo;
    public int BFS(int n){
        if(fibo[n]>0) return fibo[n];
        if(n==1) return fibo[n] = 1;
        else if(n==2) return fibo[n] = 1;
        else return fibo[n] = BFS(n-2)+BFS(n-1);
    }

    public static void main(String[] args) {
        Test4 T = new Test4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo = new int[n];
        T.BFS(n);
    }
}
