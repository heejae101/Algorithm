package section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution5 {

    Queue<Integer> Q = new LinkedList<>();
    static int[] arr;
    static int answer = Integer.MAX_VALUE;
    static int n,total;

    public int BFS(){
        for(int i=0; i<n; i++){
            // 첫번째 부터 사용한다면
            Q.offer(arr[i]);
            // 레벨 초기화
            int level = 0;
            // 합 초기화
            int sum = 0;
            // Q가 없을 때 까지
            while (!Q.isEmpty()){
                boolean check = false;
                // Q 길이 만큼 for문
                int len = Q.size();
                for(int x=0; x<len; x++){
                    if(!check){
                        // Q 에서 값 빼기
                        int target = Q.poll();
                        // Q 에서 뺀값
                        for(int j=0; j<n; j++){
                            int nx = target+arr[j];
                            if(nx == total){
                                Q.clear();
                                check = true;
                                level++;
                                break;
                            } else Q.offer(nx);
                        }
                    }else break;
                }
                level++;
            }
            answer = Math.min(level, answer);
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        total = sc.nextInt();
        s.BFS();
        System.out.println(answer);
    }
}
