package testSection1;

import java.util.*;

public class Test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = 0;
        int[] arr = null;
        int[] temp = null;
        while (true){
            int a = sc.nextInt();
            if(a == -1) break;
            else{
                temp = arr;
                arr = new int[++len];
                arr[len-1] = a;
                if(temp != null){
                    for(int i=0; i<temp.length; i++){
                        arr[i] = temp[i];
                    }
                }
                System.out.println(Arrays.toString(arr));
            }
        }

        ArrayList<Integer> arr1 = new ArrayList<>();
        Set<Integer> arr2 = new HashSet<>();
        Map<String,Integer> arr3 = new HashMap<>();

    }
}
