package section8;

import java.util.Arrays;
import java.util.Scanner;

public class Solution10 {
    // 미로 탐색 문제

    static int[][] miro = new int[7][7];
    // 상하좌우
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int count = 0;

    public void printMiro(){
        for(int i =0; i<7; i++){
            System.out.println(Arrays.toString(miro[i]));
        }
        System.out.println();
    }

    public void DFS(int y, int x){
        if(x==6 && y==6){
            count++;
            printMiro();
        }
        else{
            for(int i=0; i<4;i++){
                int ny = y+dy[i];
                int nx = x+dx[i];
                if(ny>=0 && nx>=0 && ny<=6 && nx <=6 && miro[ny][nx] == 0){
                    miro[ny][nx] = 2;
                    DFS(ny, nx);
                    miro[ny][nx] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution10 T = new Solution10();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<7; i++){
            for (int j=0; j<7; j++) miro[i][j] = sc.nextInt();
        }
        miro[0][0] = 1;
        T.DFS(0,0);
        System.out.println(count);
    }
}
