package section6;

import java.util.Arrays;
import java.util.Scanner;

public class DecisionAlgorithm {
    public int count(int[] arr, int capacity){
        int cnt = 1, sum = 0; //DVD 장수
        for(int x : arr){
            if(sum+x > capacity){
                // capacity 보다 클때는 장수가 늘어나고 그 장으로 다시함
                cnt++;
                sum = x;
            }
            else{ // capacity 보다 낮을때는 계속 더해줌
                sum += x;
            }
        }
        return cnt;
    }

    public int solution(int n, int m, int[] arr){
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); // 최대값 구하기(리덕션 큰 데이터가 있을때 조건의 값을 찾아낸다.라는 뜻)
        // max()는 option을 반환하기 때문에 getASInt를 사용한다.
        int rt = Arrays.stream(arr).sum(); // sum는 int로 반환함

        //이분검색
        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(count(arr,mid) <= m){
                answer = mid;
                rt = mid-1;
            }
            else{
                lt = mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        DecisionAlgorithm t = new DecisionAlgorithm();
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0; i<arrLen; i++) arr[i] = sc.nextInt();
        System.out.println(t.solution(arrLen, m, arr));
    }
}
