package section8;

import java.util.Scanner;

public class Solution6 {
    // 순열 구하기
    // 10 이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력
    static int[] pm, ch, arr;
    static int n, m;
    public void DFS(int L){
        if(L==m){
            for (int x : pm) System.out.print(x+" ");
            System.out.println();
        }
        else {
            for(int i=0; i<n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution6 T = new Solution6();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        ch = new int[n];
        pm = new int[n];
        T.DFS(0);
    }

}
