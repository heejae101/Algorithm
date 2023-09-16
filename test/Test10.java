package test;

import java.util.Scanner;

public class Test10 {
    // 결정 알고리즘
    public int count(int mid, int[] arr){
        int sum = 0;
        int cnt = 1;
        for(int x : arr){
            if((sum+x) > mid){
                sum = x;
                cnt++;
            }else sum += x;
        }
        return cnt;
    }
    public int solution(int n, int m, int[] arr){
        int lt = 0;
        int rt = 0;
        int answer = 0;
        for(int i=0; i<n; i++) rt += arr[i];

        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(count(mid,arr) <= m){
                answer = mid;
                rt = mid-1;
            }else lt = mid+1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Test10 T = new Test10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n,m,arr));
    }
}
