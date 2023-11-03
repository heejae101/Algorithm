package testSection7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test8_2 {
    // 송아지 찾기
    static Queue<Integer> q = new LinkedList<>();
    static int[] move = {1,-1,5};
    static int[] chk = new int[10001];

    public int BFS(int s, int e){
        int level = 0;
        q.offer(s);
        chk[s] = 1;
        while (!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int now = q.poll();
                for(int x : move){
                    int nx = now+x;
                    if(nx == e) return level+1;
                    if(nx>=1 && nx<=10000 &&chk[nx] == 0){
                        q.offer(nx);
                        chk[nx] = 1;
                    }
                }
            }
            level++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Test8_2 T = new Test8_2();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS(s,e));
    }
}
