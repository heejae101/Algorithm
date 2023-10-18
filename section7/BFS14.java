package section7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BFS14 {
    static int n,m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] chk, dis;
    public void BFS(int V){
        Queue<Integer> queue = new LinkedList<>();
        chk[V] = 1;
        queue.offer(V);
        while (!queue.isEmpty()){ // 큐에 값이 없을 때 까지
            int cv = queue.poll(); // currentvertex 정점 하나 꺼내기
            for(int nv : graph.get(cv)){
                if(chk[nv] == 0){
                    chk[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS14 T = new BFS14();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>(); // 인접리스트 만들기
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        chk = new int[n+1]; // 체크 배열
        dis = new int[n+1]; // distance 배열
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i+" : "+dis[i]);
        }

    }
}
