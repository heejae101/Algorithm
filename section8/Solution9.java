package section8;

import java.util.Scanner;

public class Solution9 {
    // 조합구하기
    static int n,m;
    static int[] combi;

    public void DFS(int L, int startNum){
        if(L==m){
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }
        else{
            for(int i=startNum; i<=n; i++){
                combi[L]= i;
                DFS(L+1,i+1);
            }
        }
    }
    public static void main(String[] args) {
        Solution9 T = new Solution9();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        T.DFS(0,1);
    }
}
