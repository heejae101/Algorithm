package testSection4;

import java.util.Scanner;

// 2:21 ~ 3: 00
public class Test2 {
    public int solution(int n, int[][] array, int move, int[] moves){
        int count = 0, result = 0;
        int[] bucket = new int[count], temp;

        // moves 배열에 있는 행동들 하나하나 꺼내기
        for(int x : moves){
            x -= 1; // index는 -1 감소 처리
            for(int i=0; i<n; i++){ // 배열의 세로 크기 만큼 for 문
                if(array[i][x] != 0){ // 배열안에 값이 0이 아닐 시
                    if(count > 0){ // bucket 의 개수가 0 이상일때
                        if(bucket[count-1] == array[i][x]){ // bucket의 마지막 인덱스에 있는 값이랑 현재 찾은 값이랑 비교
                            count -= 1;
                            temp = bucket;
                            bucket = new int[count];
                            for(int j=0; j<count; j++) bucket[j] = temp[j];
                            result += 2;
                        }else{
                            count++;
                            temp = bucket;
                            bucket = new int[count];
                            bucket[count-1] = array[i][x];
                            for(int j=0; j<temp.length; j++) bucket[j] = temp[j];
                        }
                    }else{
                        count++;
                        bucket = new int[count];
                        bucket[count-1] = array[i][x];
                    }
                    array[i][x] = 0;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Test2 T = new Test2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) array[i][j] = sc.nextInt();
        }
        int move = sc.nextInt();
        int[] moves = new int[move];
        for(int i=0; i<move; i++) moves[i] = sc.nextInt();
        System.out.println(T.solution(n, array, move, moves));
    }
}
