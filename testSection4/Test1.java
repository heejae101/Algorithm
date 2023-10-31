package testSection4;


import java.util.Scanner;

public class Test1 {
    public int solution(int[] array, int k, int n){

        for(int i=0; i<n-1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[idx] < array[j]) {
                    idx = j;
                }
            }
            if (idx != i) {
                int temp = array[i];
                array[i] = array[idx];
                array[idx] = temp;
            }
        }


        int count = 0;
        for(int i=0; i<n; i++){
            int x = array[i];
            for(int j=i+1; j<n; j++){
                int y = array[j];
                for(int z=j+1; z<n; z++){
                    int result = x+y+array[z];
                    count++;
                    if(count == k) return result;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Test1 T = new Test1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<n; i++) array[i] = sc.nextInt();
        System.out.println(T.solution(array,k,n));
    }
}
