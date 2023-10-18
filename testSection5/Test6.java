package testSection5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test6 {
// add() 삽입 성공 : true , 실패 : IllegalStateException
// offer() 반환값 boolean
    // remove() : 삭제된 value / 공백이면 NoSuchElementException
    // poll() : 삭제된 value / 공백이면 null 반환
    // element(): head (일반 큐 첫번째 값) 반환 공백이면 NoSuchElementException
    // peek() : head 값 반환 공백이면 null 반환
    public int solution(int[] arr, int k){
        int cnt = 1;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0; i<arr.length; i++) queue.offer(arr[i]);
        while (queue.size() != 1){
            if(cnt != k){
                cnt++;
                queue.offer(queue.poll());
            }else{
                cnt = 1;
                queue.poll();
            }
        }
        return queue.poll();
    }
    public static void main(String[] args) {
        Test6 T = new Test6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = i+1;
        System.out.println(T.solution(arr, k));
    }
}
