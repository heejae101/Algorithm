package section8;

import java.util.Scanner;

public class Solution7_1 {
    static int[] arr, ch, pm;
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
        ch = new int[n];
        pm = new int[m];
        T.BFS(0);
    }
}
