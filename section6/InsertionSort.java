package section6;

import java.util.Scanner;

public class InsertionSort {

    /**
     * 삽입정렬-오름차순
     * 선택한 자리보다 앞에 있는 숫자를 비교하고 작은 숫자를 앞에다 둠
     * @param arr 배열
     * @param arrLen 배열길이
     * @return 정렬된 배열
     */
    public int[] solution(int[] arr, int arrLen){
        for(int i=1; i<arrLen; i++){
            int temp = arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j] > temp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        InsertionSort sort = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i = 0; i < arrLen; i++ ) arr[i] = sc.nextInt();
        for(int x : sort.solution(arr,arrLen)) System.out.print(x+" ");
    }
}
