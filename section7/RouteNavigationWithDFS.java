package section7;

import java.util.Scanner;

public class RouteNavigationWithDFS {
    static int n,m,answer=0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v){
        if(v==n) answer++;
        else{
            for(int i=1; i<=n; i++){
                if(graph[v][i]==1 && ch[i]==0){
                    ch[i]=1;
                    DFS(i);
                    ch[i]=0; // back 시점
                }
            }
        }
    }

    public static void main(String[] args) {
        RouteNavigationWithDFS T = new RouteNavigationWithDFS();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 노드의 개수
        m = sc.nextInt(); // 간선의 개수
        graph = new int[n+1][n+1]; //
        ch = new int[n+1]; // check 배열
        for(int i=0; i<m; i++){
            int a = sc.nextInt(); // 시작 지점
            int b = sc.nextInt(); // 종료 시점
            graph[a][b] = 1;
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
