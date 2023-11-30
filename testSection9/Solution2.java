package testSection9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int s , e;
    Time(int s, int e){
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o) {
        if(o.e == this.e) return this.s - o.s ;
        else return this.e - o.e;
    }
}
public class Solution2 {
    public int solution(ArrayList<Time> arr){
        int answer = 0;
        int et = 0;
        Collections.sort(arr);
        for(Time x: arr){
            if(x.s >= et){
                et = x.e;
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution2 T = new Solution2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            arr.add(new Time(s,e));
        }
        System.out.println(T.solution(arr));
    }
}
