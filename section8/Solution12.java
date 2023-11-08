package section8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Solution12 {
    //토마토
    static int n,m,days=0,count=0,total=0;
    static int[][] box;
    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,0};
    static Queue<Position> q = new LinkedList<>();

    public int BFS(){
        while (!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                Position position = q.poll();
                for(int j=0; j<4; j++){
                    int ny = position.y+dy[j];
                    int nx = position.x+dx[j];
                    if(ny>=0 && ny<=n-1 && nx >=0 && nx<=m-1 && box[ny][nx]==0){
                        box[ny][nx]=days+1;
                        q.add(new Position(ny,nx));
                        count++;
                        if(count == total) return days;
                    }
                }
            }
            days++;
        }
        return days;
    }

    public static void main(String[] args) {
        Solution12 T = new Solution12();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        box = new int[n][m];
        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                box[i][j] = sc.nextInt();
                if(box[i][j] == 1){
                    count++;
                    q.offer(new Position(i,j));
                }else if(box[i][j] == 0){
                    total++;
                }
            }
        }
        total+=count;
        System.out.println(T.BFS());
    }
}
