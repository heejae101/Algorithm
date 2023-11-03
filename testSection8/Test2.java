package testSection8;

import java.util.Map;
import java.util.Scanner;

public class Test2 {

    static int[] arr;
    static int c,n,result=Integer.MIN_VALUE;

    public void BFS(int idx, int sum){
        if(sum > c) return;
        if(idx == n) result = Math.max(result,sum);
        else{
            BFS(idx+1,sum+arr[idx]);
            BFS(idx+1,sum);
        }
    }


    public static void main(String[] args) {
        Test2 T = new Test2();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        T.BFS(0,0);
        System.out.println(result);
    }
}
