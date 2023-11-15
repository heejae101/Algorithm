import java.util.HashMap;

public class Test2 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // 전체 벽 n
        // 페인트 칠하는 길이 m
        // section 안칠해진 곳
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : section) map.put(x,0);

        int lt = section[0]
        for(int i=section[0]; i<n; i++){
            int rt = i+m-1;
            if(rt<n && rt)
            boolean check = false;
            for(int j=lt; j<=rt; j++){
                if(map.get(j) != null && map.get(j) == 0){
                    map.put(j,1);
                    check = true;
                }
            }
            if(check) answer+=1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test2 T = new Test2();
        int[] section= {2, 3, 6};
        System.out.println(T.solution(8,4,section));
    }
}
