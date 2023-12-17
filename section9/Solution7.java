package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge2 implements Comparable<Edge2>{

    int v1,v2,cost;
    Edge2(int v1, int v2, int cost){
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }
    // 오름차순
    @Override
    public int compareTo(Edge2 o) {
        return this.cost-o.cost;
    }
}
public class Solution7 {

    static int v,e;
    static int[] unf;
    public static int find(int v){
        if(v==unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }
    public static void union(int a, int b){
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) unf[fa] = fb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();
        unf = new int[v+1];
        ArrayList<Edge2> arr = new ArrayList<>();
        for(int i=1; i<=v; i++) unf[i] = i;
        for(int i=0; i<e; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Edge2(a,b,c));
        }
        int answer = 0;
        Collections.sort(arr);
        for(Edge2 ob : arr){
            int fv1 = find(ob.v1);
            int fv2 = find(ob.v2);
            if(fv1 != fv2){
                answer += ob.cost;
                union(ob.v1, ob.v2);
            }
        }
        System.out.println(answer);
    }
}
