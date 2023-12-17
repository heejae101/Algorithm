package section10;

import java.util.Scanner;

public class Solution3 {
    static int[] dy;
    static int[] arr;

    public int solution(int n){
        int answer = 0;
        dy[1] = 1;
//        answer = dy[1]; 길이가 2 이하인 배열은 실행이 안되므로 ㅇ
        for(int i=1; i<n; i++){
            int max = 0;
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[i] && dy[j]>max) max = dy[j];
            }
            dy[i] = max+1;
            answer = Math.max(answer,dy[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        // 부분 증가수열
        Scanner sc = new Scanner(System.in);
        Solution3 S = new Solution3();
        int n = sc.nextInt();
        arr = new int[n+1];
        dy = new int[n+1];
        for(int i=1; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(S.solution(n));
    }
}
