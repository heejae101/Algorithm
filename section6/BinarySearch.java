package section6;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public int soultion(int arrLen, int target, int[] arr){
        int answer = -1;

        // 삽입정렬 오름차순
        for(int i=1; i<arrLen; i++){
            int temp = arr[i] , j;
            for(j = i-1; j>=0; j--){
                if(arr[j] > temp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = temp;
        }

        int lt = 0;
        int rt = arrLen-1;
        // 이분 검색
        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(arr[mid] == target){
                answer = mid+1;
                break;
            }
            if(arr[mid] > target){
                rt = mid-1;
            }else lt = mid+1;
        }

        return answer;
    }
    public static void main(String[] args) {
        BinarySearch T = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int selectNum = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0; i<arrLen; i++) arr[i] = sc.nextInt();
        System.out.println(T.soultion(arrLen, selectNum, arr));
        Arrays.sort(arr);
    }
}
