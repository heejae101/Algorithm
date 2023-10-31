package testSection4;

import java.util.Scanner;

// 3:21
public class Test3 {

    public int[] sorting(int n, int[] arr){
        for(int i=0; i<n; i++){
            int idx = i;
            for (int j=i+1; j<n; j++){
                if(arr[idx]>arr[j]) idx = j;
            }
            if(idx != i){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        return arr;
    }
    public int solution(int m ,int[] arr){
        int lt = 0;
        int rt = arr.length;
        while (lt<=rt){
            int avg = (lt+rt)/2;
            if(arr[avg]>m){
                rt = avg-1;
            }else if(arr[avg]<m)lt = avg+1;
            else return avg;
        }
        return 0;
    }

    public static void main(String[] args) {
        Test3 T = new Test3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(m, T.sorting(n,arr)));
    }
}
