package testSection9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person>{
    int h,w;

    Person(int h, int w){
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Person o) {
        return o.h-this.h;
    }
}
public class Solution1 {
    public int solution(ArrayList<Person> arr){
        // 내림차순
        Collections.sort(arr);
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for(Person x : arr){
            if(x.w > max){
                max = x.w;
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution1 T = new Solution1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Person(h,w));
        }
        System.out.println(T.solution(arr));
    }
}
