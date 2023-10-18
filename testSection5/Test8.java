package testSection5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test8 {
    public int solution(int m, int[] arr){
        int target = arr[m-1];
        int cnt = 0;
        Queue<Integer> Q = new LinkedList<>();
        for(int x : arr) Q.offer(x);
        while (Q.contains(target)){
            int patientScore = Q.poll();
            if(patientScore < Q.peek()){
                cnt++;
                Q.offer(patientScore);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Test8 T = new Test8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(m, arr));
    }
}
