import java.util.Scanner;

public class LRU {

    public int[] solution(int size, int arrLen, int[] arr){
        int[] cache = new int[size];
        for(int x : arr){
            int pos=-1; //인덱스 번호
            for(int i=0; i<size; i++){
                if (x == cache[i]) pos = i; // hit값 찾기
            }
            if(pos==-1){ // miss 상황
                for(int i=size-1; i>=1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            else { // hit
                for(int i=pos; i>=1; i--){
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }
    public static void main(String[] args) {
        LRU a = new LRU();
        Scanner sc = new Scanner(System.in);
        int cacheSize = sc.nextInt();
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int i=0; i<arrLen; i++) arr[i]=sc.nextInt();
        for(int x : a.solution(cacheSize, arrLen, arr)) System.out.print(x+" ");
    }
}
