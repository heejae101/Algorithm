package testSection8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
    int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Test12 {
    static int n,m,days=0,total=0,cnt;
    static int[][] board;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<Point> q = new LinkedList<>();

    public int BFS(){
        while (!q.isEmpty()){
            days++;
            int size = q.size();
            for(int i=0; i<size; i++){
                Point point = q.poll();
                for(int j=0; j<4; j++){
                    int nx = point.x+dx[j];
                    int ny = point.y+dy[j];
                    if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny] == 0){
                        if(++cnt == total) return days;
                        board[nx][ny] = 1;
                        q.offer(new Point(nx,ny));
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Test12 T = new Test12();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        board = new int[n][m];
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1) q.offer(new Point(i,j));
                else if(board[i][j] == 0) total++;
            }
        }
        System.out.println(T.BFS());
    }
}
