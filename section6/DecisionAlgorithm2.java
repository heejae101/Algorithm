package section6;

import java.util.Arrays;
import java.util.Scanner;

public class DecisionAlgorithm2 {

    public int count(int min , int[] arr){
        int cnt = 1;
        int ep = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i]-ep >= min){
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] arr){
        int result = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];

        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(count(mid , arr) >= c){
                result = mid;
                lt = mid+1;
            }else rt = mid-1;
        }
        return result;
    }
    public static void main(String[] args) {
        DecisionAlgorithm2 t = new DecisionAlgorithm2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(t.solution(n,c,arr));
    }
}
