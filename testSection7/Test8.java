package testSection7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test8 {

    /**
     *  non-static
     *  객체마다 맴버가 별도로 존재
     *  객체 생성 시 멤버 생성
     *  공유하지 않고, 객체마다 다 자기것을 가짐
     *
     *  static
     *  클래스 하나에 맴버가 하나 존재
     *  클래스 로딩시에 생성 ( 객체 생성전에 멤버가 이미 생성됨, 객체의 소멸에도 멤버가 안 사라짐 )
     *  동일한 클래스라면 모두가 한가지를 공유함
     */
    Queue<Integer> Q = new LinkedList<>();
    static int[] dis = {1,-1,5};
    int[] ch;

    public int solution(int s, int e){
        ch = new int[10001];
        ch[s] = 1;
        int level = 0;
        Q.offer(s);
        while (!Q.isEmpty()){
            int len = Q.size();
            for(int i=0; i<len; i++){
                int x = Q.poll();
                for(int j=0; j<dis.length; j++){
                    int nx = x+dis[j];
                    if(nx == e){
                        return level+1;
                    }else if(nx >= 1 && nx <= 10000 && ch[nx]==0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(t.solution(s,e));
    }
}
