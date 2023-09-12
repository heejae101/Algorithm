package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0; i<arrLen; i++) arr[i] = sc.nextInt();

        for(int i=0; i<arrLen; i++){
            int idx = i;
            for(int j=i+1; j<arrLen; j++){
                if(arr[idx] > arr[j]) idx = j;
            }
            if(idx != i){
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
