package section8;

import java.util.Map;
import java.util.Scanner;

public class Solution2 {

    static int[] dogs;
    static int c, n, answer=Integer.MIN_VALUE;
    public void DFS(int idx, int sum){
        if(sum>c) return;
        if(idx == n) answer = Math.max(answer, sum);
        else{
            DFS(idx+1, sum+dogs[idx]);
            DFS(idx+1, sum);
        }
    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        dogs = new int[n];
        for(int i=0; i<n; i++) dogs[i] = sc.nextInt();
        s.DFS(0,0);
        System.out.println(answer);
    }
}
