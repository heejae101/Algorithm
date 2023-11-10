package testSection8;

import java.util.Scanner;

public class Test9 {
    // 조합구하기
    // 시작 3:11 끝
    // 1부터 N까지 번호가 적힌 구슬이 있습니다. 이중 M개를 뽑는 방법의 수를 출력

    static int n,m;
    static int[] combi;

    public void DFS(int L, int startNum){
        if(L==m){
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }else {
            for(int i=startNum; i<=n; i++){
                combi[L] = i;
                DFS(L+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        Test9 T = new Test9();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        T.DFS(0,1);
    }
}
