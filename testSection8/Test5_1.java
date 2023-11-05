package testSection8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test5_1 {

    // TreeSet을 사용하는 경우 중복 제거와 정렬된 상태를 유지할 수 있지만, 성능 측면에서는 배열보다 느릴 수 있습니다.
    // 반면에 배열은 빠른 접근 및 수정이 가능하지만, 중복된 값은 포함되며 정렬된 상태를 유지하지 않습니다.
    static int n,m,result = Integer.MAX_VALUE;
    static Integer[] arr;

    public void DFS(int L, int sum){
        if(L > result) return ;
        if(sum > m) return;
        if(sum == m) result = Math.min(result,L);
        else {
            for(int i=0; i<n; i++){
               DFS(L+1, sum+arr[i]);
               DFS(L+1, sum);
            }
        }
    }

    public static void main(String[] args) {
        Test5_1 T = new Test5_1();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        T.DFS(0,0);
        System.out.println(result);
    }
}
