package section8;

import java.util.Scanner;

public class Solution8 {
    // 3 1 2 4
    //  4 3 6
    //   7 9
    //   16

    // b cobi 값 p 순열값 체크 ch
    static int[] b, p, ch;
    // n은 숫자 f는 마지막 숫자
    static int n,f;
    // 제귀 멈추기
    boolean flag = false;
    int[][] dy = new int[35][35];

    // 미리 콤비네이션을 만들어서 dy에 넣어놓는다.
    public int combi(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = combi(n-1,r-1)+combi(n-1,r);
    }

    public void DFS(int L, int sum){
        if(flag) return;
        if(L==n){
            if(sum == f){
                for(int x : p) System.out.print(x+" ");
                flag = true;
            }
        }else{
            // 순열 숫자 인덱스 아님
            for(int i=1; i<=n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L+1,sum+(p[L]*b[L]));
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Solution8 T = new Solution8();
        Scanner sc = new Scanner(System.in);
        // n = 가장 윗줄에 있는 숫자 개수
        n = sc.nextInt();
        // 결과값
        f = sc.nextInt();
        // 콤비네이션
        b = new int[n];
        // 숫자들 (배열)
        p = new int[n];
        // 숫자를 1부터 사용
        ch = new int[n+1];
        for(int i=0; i<n; i++) b[i] = T.combi(n-1,i);
        T.DFS(0,0);
    }
}
