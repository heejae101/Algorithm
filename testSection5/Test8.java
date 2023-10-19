package testSection5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test8 {
    public int solution(int n, int m, int[] arr){
        Queue<Integer> Q = new LinkedList<>();
        int target = arr[m-1];
        int cnt = 0;

        for(int x : arr) Q.offer(x);
        while (!Q.isEmpty()){
            int lt = Q.poll();
            if(Q.peek() != null && lt < Q.peek()){
                Q.offer(lt);
                lt = -1;
            }else cnt++;
            if(lt != -1){

            }
        }
        return cnt++;
    }

    public static void main(String[] args) {
        Test8 T = new Test8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}
