package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0; i<arrLen; i++) arr[i] = sc.nextInt();

        for(int i=1; i<arrLen; i++){
            int temp = arr[i],j;
            for(j=i-1; j>=0; j--){
                if(arr[j] > temp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = temp;
        }

        for(int x : arr) System.out.print(x+" ");
    }
}
