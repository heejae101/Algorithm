package testSection6;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0; i<arrLen; i++) arr[i] = sc.nextInt();

        for(int i=0; i<arrLen-1; i++){
            for(int j=0; j<arrLen-1-i;j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int x : arr) System.out.print(x+" ");
    }
}
