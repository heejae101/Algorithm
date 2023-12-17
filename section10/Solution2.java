package section10;

import java.util.Scanner;

public class Solution2 {
    static int[] dy;

    public int solution(int n){
        dy[1] = 1;
        dy[2] = 2;
        for (int i=3; i<=n; i++) dy[i] = dy[i-2] + dy[i-1];
        return dy[n] + dy[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution2 S = new Solution2();
        int n = sc.nextInt();
        dy = new int[n+1];
        System.out.println(S.solution(n));
    }
}
