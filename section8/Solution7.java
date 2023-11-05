package section8;

import java.util.Scanner;

public class Solution7 {
    // 10개 이하의 N개의 자연수가 주어지면 이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.

    static int[] arr;
    static int n,m;
    public void BFS(int idx){
        if(idx == m) return;
        else{
            for(int i=0; i<n; i++){
                if(arr[i] != arr[idx]) System.out.println(arr[idx]+" "+arr[i]);
            }
            BFS(idx+1);
        }
    }

    public static void main(String[] args) {
        Solution7 T = new Solution7();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        T.BFS(0);
    }
}
