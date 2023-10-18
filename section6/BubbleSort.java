package section6;

import java.util.Scanner;

public class BubbleSort {

    /**
     * 버블정렬-오름차순
     * 인접해 있는 두 수를 비교 하여 자리교체하는 알고리즘
     * 제일 끝에 있는 수(제일 큰 수)부터 찾는 알고리즘
     * @param arr 배열
     * @param arrLen 배열길이
     * @return 정렬된 배열
     */
    public int[] solution(int[] arr, int arrLen){
        for(int i=0; i<arrLen-1; i++){
            for(int j=0; j<arrLen-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0; i<arrLen; i++) arr[i] = sc.nextInt();
        for(int x : sort.solution(arr,arrLen)) System.out.print(x + " ");
    }
}
