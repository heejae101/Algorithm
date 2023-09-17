package testSection6;

import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);

        for(int i=0; i<n; i++){
            if(arr[i] != arr2[i]) System.out.print(i+1+ " ");
        }
    }
}
