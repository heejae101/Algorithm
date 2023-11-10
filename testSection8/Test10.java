package testSection8;

import java.util.Scanner;

public class Test10 {

    static final int size = 7;
    static int cnt = 0;
    static int[][] board = new int[size][size];
    static int[] dx = {0,1,0,-1};
    static int[] dy = {-1,0,1,0};

    public void DFS(int x, int y){
        if(x==size-1 && y==size-1) cnt++;
        else {
            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx>=0 && nx<size && ny>=0 && ny<size && board[nx][ny]==0){
                    board[nx][ny] = 1;
                    DFS(nx,ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Test10 T = new Test10();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++) board[i][j] = sc.nextInt();
        }
        board[0][0] = 1;
        T.DFS(0,0);
        System.out.println(cnt);
    }
}
