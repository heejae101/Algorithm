package section9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
    public int money;
    public int time;

    Lecture(int money, int time){
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lecture o) {
        return o.time - this.time; // 내림차순
    }
}
public class Solution4 {
    static int n, max = Integer.MIN_VALUE;
    public int solution(ArrayList<Lecture> arr){
        int answer = 0;
        // 큰 값을 먼저 빼주려고
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); // 기본형은 작은값을 주는거고 큰 값이면 reversOrder
        Collections.sort(arr);
        int j = 0;
        for(int i=max; i>=1; i--){
            for(; j<n; j++){
                if(arr.get(j).time<i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution4 T = new Solution4();
        Scanner sc = new Scanner(System.in);
        // 시간 내림차순으로 저장
        ArrayList<Lecture> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m,d));
            // max 최대 날짜
            if(d>max) max = d;
        }
        System.out.println(T.solution(arr));
    }
}
