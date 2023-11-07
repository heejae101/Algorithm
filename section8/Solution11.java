package section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Position{
    int y,x;
    public Position(int y, int x){
        this.y = y;
        this.x = x;
    }
}
public class Solution11 {

    static final int size = 7;
    static int[][] board = new int[size][size];
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int level=0;
    static Queue<Position> q = new LinkedList<>();

    public int BFS(){
        while (!q.isEmpty()){
            int queueSize = q.size();
            for(int i=0; i<queueSize; i++){
                Position position = q.poll();
                for(int j=0;j<4;j++){
                    int ny = position.y+dy[j];
                    int nx = position.x+dx[j];
                    if(ny >= 0 && nx >= 0 && ny <= size-1 && nx <= size-1 && board[ny][nx] == 0){
                        if(ny == size-1 && nx == size-1){
                            return level+1;
                        }else{
                            board[ny][nx] = 1;
                            q.add(new Position(ny,nx));
                        }
                    }
                }
            }
            level++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution11 T = new Solution11();
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<size; i++){
            for (int j=0; j<size; j++) board[i][j] = sc.nextInt();
        }
        board[0][0]=1;
        q.offer(new Position(0,0));
        System.out.println(T.BFS());
    }
}
