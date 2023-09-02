import java.util.Scanner;

public class SelectionSort {

    /**
     * 선택정렬-오름차순
     * 선택한 숫자의 뒤부터 비교하여 자리교체하는 알고리즘
     * 제일 처음 숫자(제일 작은 숫자)부터 찾는 알고리즘
     * @param arrLen 배열 길이
     * @param arr 배열
     * @return 정렬된 배열
     */
    public int[] solution(int arrLen, int[] arr){
        for(int i=0; i<arrLen-1; i++){
            int idx = i;
            for(int j=i+1; j<arrLen; j++){
                if(arr[j]<arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        SelectionSort a = new SelectionSort();
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0; i<arrLen; i++) arr[i] = sc.nextInt();
        for(int x : a.solution(arrLen,arr)) System.out.print(x+" ");

    }
}
