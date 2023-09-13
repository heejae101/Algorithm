package test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0; i<arrLen; i++) arr[i] = sc.nextInt();

        for(int i=1; i<arrLen; i++){
            int temp = arr[i], j;
            for(j=i-1; j>=0; j--){
                if(temp < arr[j]) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = temp;
        }

        int lt = 0;
        int rt = arrLen-1;
        int result = 0;
        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(target == arr[mid]){
                result = mid+1;
                break;
            }else if(target < arr[mid]) rt = mid-1;
            else lt = mid+1;
        }
        System.out.println(result);
    }
}
