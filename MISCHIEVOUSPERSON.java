import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MISCHIEVOUSPERSON {

    public ArrayList<Integer> solution(int arrLen, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone(); //깊은 복사
        Arrays.sort(tmp);
        for(int i=0; i<arrLen; i++){
            if(arr[i] != tmp[i]) answer.add(i+1);
        }
//        삽입정렬
//        for(int i=1; i<arrLen; i++){
//            int tmp = arr[i], j;
//            for(j=i-1; j>=0; j--){
//                if(arr[j] > tmp) arr[j+1] = arr[j];
//                else break;
//            }
//            arr[j+1] = tmp;
//        }
        return answer;
    }


    public static void main(String[] args) {
        MISCHIEVOUSPERSON t = new MISCHIEVOUSPERSON();
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0; i<arrLen; i++) arr[i] = sc.nextInt();
        for(int x : t.solution(arrLen, arr)) System.out.print(x+"");
    }
}
