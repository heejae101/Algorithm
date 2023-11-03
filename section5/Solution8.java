package section5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Person{
    int id;
    int risk;
    public Person(int id, int risk){
        this.id = id;
        this.risk = risk;
    }
}
public class Solution8 {

    static Queue<Person> q = new LinkedList<>();

    public int solution(int n, int m){
        int answer = 1;
        while (!q.isEmpty()){
            Person tmp = q.poll();
            for(Person x : q){
                if(tmp.risk < x.risk){
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                if(tmp.id == m) return answer;
                else answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution8 T = new Solution8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0; i<n; i++) q.offer(new Person(i,sc.nextInt()));
        System.out.println(T.solution(n,m));
    }
}
