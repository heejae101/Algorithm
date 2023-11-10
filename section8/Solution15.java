package section8;

import java.util.ArrayList;
import java.util.Scanner;

class Point{

    public int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Solution15 {

    static int n, m, len, answer;
    static ArrayList<Point> pz,hs;
    static int[] combi;

    public void DFS(int L, int s){
        if(L==m){
            int sum = 0;
            for(Point h : hs){
                int dis = Integer.MAX_VALUE;
                // 조합의
                for(int i : combi){
                    // 절대값 abs 거리값 구하기
                    dis=Math.min(dis,Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        }
        else {
            for(int i=s; i<len; i++){
                combi[L]=i;
                DFS(L+1,i+1);
            }
        }
    }
    public static void main(String[] args) {
        Solution15 T = new Solution15();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // 피자 개수
        pz = new ArrayList<>();
        // 집 개수
        hs = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int tmp = sc.nextInt();
                if(tmp == 1) hs.add(new Point(i,j));
                else if(tmp ==2) pz.add(new Point(i,j));
            }
        }
        // 피자집 사이즈
        len = pz.size();
        combi = new int[m]; // len C m
        T.DFS(0,0);
        System.out.println(answer);
    }
}
