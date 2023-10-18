import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지 찾기
public class BFS {
    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch; // 한번 넣었던거는 안넣겠다 시간복잡도를 위하여 check배열
    Queue<Integer> Q = new LinkedList<>();
    public int BFS1 (int s, int e){
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L=0;
        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                int x = Q.poll();
                for(int j=0; j<3; j++){
                    int nx=x+dis[j];
                    if(nx == e) return L+1;
                    if(nx>=1 && nx <= 10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
                L++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        BFS T = new BFS();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS1(s,e));
    }
}
