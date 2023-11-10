package testSection8;

import java.util.Scanner;

public class Test13 {

    static int[][] map;
    static int[] dx = {-1,-1,0,1,1,1,0,-1};
    static int[] dy = {0,1,1,1,0,-1,-1,-1};
    static int cnt,size;

    public void DFS(int x, int y){
        for(int i=0; i<8; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<size && ny>=0 && ny<size && map[nx][ny] == 1){
                map[nx][ny] = 0;
                DFS(nx,ny);
            }
        }
    }
    public static void main(String[] args) {
        Test13 T = new Test13();
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        map = new int[size][size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++) map[i][j] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(map[i][j] == 1){
                    map[i][j] = 0;
                    cnt++;
                    T.DFS(i,j);
                }
            }
        }
        System.out.println(cnt);
    }
}
