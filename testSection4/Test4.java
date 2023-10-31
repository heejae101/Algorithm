package testSection4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test4 {
    int answer = 0;
    int[] dis = {1,-1,5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int s, int e){
        ch = new int[1001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                int x = Q.poll();
                for(int j=0; j<3; j++){
                    int nx = x+dis[j];
                    if(nx >= 1 && )
                }
            }
        }
    }

    public static void main(String[] args) {
        Test4 T = new Test4();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS(s,e));
    }
}
