package test;

import java.util.Scanner;

public class Test4 {

    public int[] soultion(int s, int n, int[] arr){
        int[] cache = new int[s];
        int arrCnt = 0;
        for(int x : arr){
            int idx = -1;
            for(int i=0; i<arrCnt; i++){
                if(x == cache[i]) idx = i;
            }
            if(idx == -1){
                for(int i=arrCnt-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }else{
                for(int i=idx; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
            arrCnt = arrCnt < 5 ? arrCnt++ : 5 ;
        }
        return cache;
    }
    public static void main(String[] args) {
        Test4 t = new Test4();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        for(int x : t.soultion(s,n,arr)) System.out.print(x+" ");
    }
}
