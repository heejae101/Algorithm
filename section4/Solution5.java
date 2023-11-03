package section4;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution5 {

    public int soltion(int N, int K, int[] arr){
        // TreeSet
        int answer = -1;
        // 오름 차순이 기본인데 Collections 사용
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int l=j+1; l<N; l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt = 0;
        for(int x : Tset){
            if(++cnt == K){
                answer = x;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution5 T = new Solution5();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        System.out.println(T.soltion(N,K,arr));
    }
}
