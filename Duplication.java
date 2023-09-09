import java.util.HashMap;
import java.util.Scanner;

// 해쉬 맵도 가능하지만 정렬로 풀기
public class Duplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap();
        int len = sc.nextInt();
        String result = "U";
        for(int i=0; i<len; i++){
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num) != null){
                result = "D";
                break;
            }
        }
        System.out.println(result);
    }
}
