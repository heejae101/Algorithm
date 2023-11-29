package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    public int s, e;
    Time(int s, int e){
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o) {
        if(this.e == o.e) return this.s - o.s;
        else return this.e-o.e;
    }
}
public class Solution2 {
    public int solution(ArrayList<Time> arr, int n){
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for(Time ob : arr){
            if(ob.s >= et) {
                et = ob.e;
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Solution2 T = new Solution2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Time(x,y));
        }
        System.out.println(T.solution(arr,n));
    }
}
