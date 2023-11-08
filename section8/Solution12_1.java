package section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution12_1 {

    static int n,m;
    static int[][] board, dis;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<Position> Q = new LinkedList<>();

    public void BFS(){
        while (!Q.isEmpty()){
            Position position = Q.poll();
            for(int i=0; i<4; i++){
                int nx = position.x+dx[i];
                int ny = position.y+dy[i];
                if(nx>=0 && ny>=0 && nx<m && ny<n && board[ny][nx] == 0){
                    board[ny][nx] =1;
                    Q.offer(new Position(ny,nx));
                    dis[ny][nx] = dis[position.y][position.x]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution12_1 T = new Solution12_1();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];
        dis = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1) Q.offer(new Position(i,j));
            }
        }
        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if(board[i][j] == 0) flag = false;
            }
        }
        if(flag){
            for(int i=0; i<n; i++){
                for (int j=0; j<m; j++){
                    answer = Math.max(answer, dis[i][j]);
                }
            }
        }else{
            answer = -1;
        }
        System.out.println(answer);
    }
}
