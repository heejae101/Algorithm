package testSection6;

import java.util.Arrays;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for(int i=0; i<n; i++){
            for(int j=0; j<5; j++) arr[i][j] = sc.nextInt();
        }

        int result = 0;
        int max = 0;

        for(int i=0; i<n; i++){ // 학생 수
            int cnt = 0;
            for(int j=0; j<n; j++){ // 비교 학생
                if(i != j){
                    continue;
                }
                for(int x=0; x<5; x++){ // 학년
                    if(arr[i][x] == arr[j][x]){
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max){
                max = cnt;
                result = i;
            }
        }

        System.out.println(result+1);
    }
    // 0 1 2 3 1
}
