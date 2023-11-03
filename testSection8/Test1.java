package testSection8;

import java.util.Scanner;

public class Test1 {

    static int[] arr;
    static boolean flag = false;
    static String answer = "NO";

    public void DFS(int idx, int sum, int n, int total){
        if(flag) return;
        if(sum > total/2) return;
        if(idx == n-1){
            if(sum == (total-sum)){
                flag = true;
                answer = "YES";
            }
        }
        else{
            DFS(idx+1,sum+arr[idx],n,total);
            DFS(idx+1,sum,n,total);
        }
    }

    public static void main(String[] args) {
        Test1 T = new Test1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        int total = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        T.DFS(0,0, n, total);
        System.out.println(answer);
    }
}
