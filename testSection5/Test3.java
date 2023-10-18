package testSection5;

import java.util.Scanner;
import java.util.Stack;
public class Test3 {
    public int solution(int[][] board, int[] move, int n){
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for(int x : move){
            for(int i=0; i<n; i++){
                int target = board[i][x-1];
                if(target != 0){
                    board[i][x-1] = 0;
                    if(!stack.isEmpty()){
                        if(stack.peek() == target){
                            result+=2;
                            stack.pop();
                        }else stack.add(target);
                    }else stack.add(target); // push()의 리턴값은  <E>이고, add()의 리턴값은 boolean이다.
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Test3 T = new Test3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                array[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] move = new int[m];
        for(int i=0; i<m; i++){
            move[i] = sc.nextInt();
        }
        System.out.println(T.solution(array,move,n));
    }
}
