package section8;

import java.util.Scanner;

public class Solution1 {

    static String answer = "NO";
    static int[] arr;
    static int total;
    boolean flag = false;
    public void DFS(int idx, int sum){
        if(flag) return;
        if(sum>total/2) return;
        if(idx == arr.length-1){
            if(sum == (total-sum)){
                answer = "YES";
                flag = true;
            }
        }else{
            DFS(idx+1, sum+arr[idx]);
            DFS(idx+1, sum);
        }
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        s.DFS(0,0);
        System.out.println(answer);
    }
}
