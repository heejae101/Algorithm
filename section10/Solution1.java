package section10;

import java.util.Scanner;

public class Solution1 {
    static int[] dy;
    public int solution(int n){
        dy[1] = 1;
        dy[2] = 2;
        for(int i=3; i<=n; i++){
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }
    public static void main(String[] args) {
        // 메모이제이션 Bottom up 방법
        // 다이나믹 테이블이 필요
        Scanner sc = new Scanner(System.in);
        Solution1 S = new Solution1();
        int n = sc.nextInt();
        dy = new int[n+1];
        System.out.println(S.solution(n));
    }
}
