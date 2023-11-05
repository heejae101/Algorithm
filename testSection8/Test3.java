package testSection8;

import java.util.Scanner;

public class Test3 {

    static int n,m,result=Integer.MIN_VALUE;
    static int[] score, time;

    public void DFS(int idx, int sumScore, int sumTime){
        if(sumTime > m) return;
        if(idx == n) result = Math.max(result,sumScore);
        else{
            DFS(idx+1,sumScore+score[idx], sumTime+time[idx]);
            DFS(idx+1,sumScore, sumTime);
        }
    }

    public static void main(String[] args) {
        Test3 T = new Test3();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        score = new int[n];
        time = new int[n];
        for(int i=0; i<n; i++){
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        T.DFS(0, 0, 0);
        System.out.println(result);
    }
}
