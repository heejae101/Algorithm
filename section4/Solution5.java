package section4;

import java.util.Scanner;

public class Solution5 {

    public int soltion(int N, int K, int[] arr){
        // TreeSet
    }
    public static void main(String[] args) {
        Solution5 T = new Solution5();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        System.out.println(T.soltion(N,K,arr));
    }
}
