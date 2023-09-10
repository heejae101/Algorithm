import java.util.Arrays;
import java.util.Scanner;

public class Duplication2 {

    public String solution(int n, int[] arr){
        String result = "U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            if(arr[i] == arr[i+1]){
                return "D";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Duplication2 dupl = new Duplication2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(dupl.solution(n,arr));
    }
}
