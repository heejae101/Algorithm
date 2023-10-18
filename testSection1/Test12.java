package testSection1;

import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1, 4};
        // 1. 삽입정렬
        for(int i=1; i<5; i++) {
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--) {
                if(arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {5, 2, 3, 1, 4};
        // 선택
        for(int i=0; i<arr2.length; i++) {
            int idx=i;
            for(int j=i; j<arr2.length; j++) {
                if(arr2[i] > arr2[j]) {
                    idx = j;
                }
            }
            if(idx != i) {
                int tmp = arr2[i];
                arr2[i] = arr2[idx];
                arr2[idx] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {5, 2, 3, 1, 4};
        for(int i=0; i<arr3.length-1; i++){
            for(int j=0; j<arr3.length-1-i; j++){
                if(arr3[j] > arr3[j+1]){
                    int temp = arr3[j];
                    arr3[j] = arr3[j+1];
                    arr3[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));


    }
}
