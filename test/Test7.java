package test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y-o.y;
        else return this.x-o.x;
        // 음수가 나오게 하면 된다.
        // 오름차순은 10, 20 이라고 했을때 10(this)- 20 을 하면 됨
        // 내림차순은 20, 10 이라고 했을때 10 - this을 하면 됨
        // 외우기!
    }
}
public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0; i<arrLen; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x+" "+o.y);
    }
}
