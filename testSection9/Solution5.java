package testSection9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    public int vex, cost;

    Edge(int vex, int cost){
        this.vex = vex;
        this.cost = cost;
    }
    // 오름차순
    @Override
    public int compareTo(Edge o) {return this.cost-o.cost;}
}
public class Solution5 {
    static int n,m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;
    public void solution(int v){
        // 우선 순위 큐 오름차순으로 뽑음
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v,0));
        dis[v] = 0;
        // 1, 0
        while (!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            // dis 배열의 수보다 현재 코스트가 크면 굳이 할 필요 없음
            if(nowCost>dis[now]) continue;
            for(Edge ob : graph.get(now)){
                if(dis[ob.vex] > nowCost+ob.cost){
                    dis[ob.vex] = nowCost+ob.cost;
                    pQ.offer(new Edge(ob.vex, nowCost+ob.cost));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution5 T = new Solution5();
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for(int i=0; i<=n; i++) graph.add(new ArrayList<Edge>());
        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge(b,c));
        }
        T.solution(1);
        for(int i=2; i<=n; i++){
            if(dis[i] != Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+" : impossible");
        }
    }
}
