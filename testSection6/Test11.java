package testSection6;

import java.util.Scanner;

public class Test11 {

    public int count(int mid, int[] arr){
        int cnt = 1;
        int idx = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] - idx >= mid){
                idx = arr[i];
                cnt++;
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[]arr){
        // 정렬 Arrays.sort(arr);
        for(int i=1; i<n; i++){
            int temp = arr[i],j;
            for(j=i-1; j>=0; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }else break;
            }
            arr[j+1] = temp;
        }

        int lt = 1;
        int rt = arr[n-1];
        int result = 0;
        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(count(mid, arr) >= c){
                result = mid;
                lt = mid+1;
            }else rt = mid-1;
        }
        return result;
    }
    public static void main(String[] args) {
        Test11 T = new Test11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)  arr[i] = sc.nextInt();
        System.out.println(T.solution(n,c,arr));
    }
}
