package section8;

import java.util.Scanner;

public class Solution3 {

    static int[] problemScores, problemTimes;
    static int n, m, totalScore=Integer.MIN_VALUE;
    public void DFS(int idx, int sumScore, int sumTime){
        if(sumTime > m) return;
        if(idx == n) totalScore = Math.max(totalScore, sumScore);
        else {
            DFS(idx+1,sumScore+problemScores[idx],sumTime+problemTimes[idx]);
            DFS(idx+1,sumScore,sumTime);
        }
    }
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        problemScores = new int[n];
        problemTimes = new int[n];
        for(int i=0; i<n; i++){
            problemScores[i] = sc.nextInt();
            problemTimes[i] = sc.nextInt();
        }
        s.DFS(0,0,0);
        System.out.println(totalScore);
    }
}
