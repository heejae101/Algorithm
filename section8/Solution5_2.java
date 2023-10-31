package section8;

import java.util.Scanner;

public class Solution5_2 {

    static int n, answer=Integer.MIN_VALUE, m;
    static int[] arr;

    public void sort(){
        for(int i=0; i<n; i++){
            int idx = i;
            for(int j=i+1; j<n; j++){
                if(idx >arr[j]){
                    idx = j;
                }
            }
            if(idx != i){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
    }
    public void DFS(int L, int sum){
        if(sum > m) return;
        if(L>=answer) return;
        if(sum == m) answer = Math.min(answer, L);
        else{
            for(int i=0; i<n; i++){
                DFS(L+1,sum+arr[i]);
                DFS(L+1,sum);
            }
        }
    }

    public static void main(String[] args) {
        Solution5_2 s = new Solution5_2();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        m = sc.nextInt();
        s.sort();
        s.DFS(0,0);
        System.out.println(answer);
    }
}
