package testSection6;

import java.util.*;

public class Test6_2 {

    static int[] cache;

    // 중복값일때 idx 반환 어짜피 idx 돌기 때문에 굳이 set을 사용할 필요가 없음
    public int tagetIdx(int taget, int s){
        for(int i=0; i<s; i++){
            if(taget == cache[i]) return i;
        }
        return -1;
    }

    public void solution(int s, int[] arr){
        // 캐시 남은 용량
        int cnt = 0;
        // 캐시 설정
        cache = new int[s];
        // 중복값 체크
        Set<Integer> set = new HashSet<>();

        // 작업 시작
        for(int x : arr){
            // 중복값이 있을때 Cache Hit
            if(set.contains(x)){
                int idx = tagetIdx(x,s);
                // Cache Hit
                if(idx != -1){
                    int taget = cache[idx];
                    for(int i=idx; i>0; i--) cache[i] = cache[i-1];
                    cache[0] = taget;
                }
            }else{
                if(cnt < s) cnt++;
                else set.remove(cache[s-1]);
                // Cache Miss
                for(int i=cnt-1; i>0; i--){
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
                set.add(x);
            }
        }

    }

    public static void main(String[] args) {
        Test6_2 T = new Test6_2();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        T.solution(s,arr);
        for(int i=0; i<s; i++) System.out.print(cache[i]+" ");
    }
}
