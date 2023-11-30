package testSection9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time2 implements Comparable<Time2>{
    int time;
    char state;
    Time2(int time, char state){
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Time2 o) {
        if(this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}
public class Solution3 {
    public int solution(ArrayList<Time2> arr){
        Collections.sort(arr);
        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        for(Time2 ob : arr){
            if(ob.state == 's')cnt++;
            else cnt--;
            answer=Math.max(answer,cnt);
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution3 T = new Solution3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time2> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr.add(new Time2(s,'s'));
            arr.add(new Time2(e,'e'));
        }
        System.out.println(T.solution(arr));
    }
}
