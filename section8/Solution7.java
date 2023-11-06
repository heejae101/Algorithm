package section8;

import java.util.Scanner;

public class Solution7 {
    // 조합의 경우수(메모이제이션)
    // 콤비네이션 5C3같은 계산 5개 중에 3개를 뽑는 경우의 수
    // 4C2 + 4C3 = 5C3 이라고 배우는데,
    // 메모이제이션(memoization)은 컴퓨터 프로그램이 동일한 계산을 반복해야 할 때,
    // 이전에 계산한 값을 메모리에 저장함으로써 동일한 계산의 반복 수행을 제거하여 프로그램 실행 속도를 빠르게 하는 기술이다.
    // 동적 계획법의 핵심이 되는 기술이다.
    int[][] dy = new int[35][35];
    public int DFS(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(r==n || r==0) return 1;
        else return dy[n][r] = DFS(n-1,r-1)+DFS(n-1,r);
    }
    public static void main(String[] args) {
        Solution7 T = new Solution7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n,r));
    }
}
