package testSection8;

import java.util.*;

public class Test5 {

    static TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
    static Queue<Integer> q = new LinkedList<>();
    public int BFS(int m){
        int L = 1;
        q.offer(set.first());
        while (!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int num = q.poll();
                for(int x : set){
                    int nx = num+x;
                    if(nx == m) return L+1;
                    else q.offer(nx);
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Test5 T = new Test5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            set.add(sc.nextInt());
        }
        int m = sc.nextInt();
        System.out.println(T.BFS(m));
    }
}
