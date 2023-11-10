package testSection8;

import java.util.ArrayList;
import java.util.Scanner;

class Location{
    int x,y;
    Location(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class Test14 {

    static int n,m,len,answer=Integer.MAX_VALUE;
    static int[][] map;
    static int[] b;
    static ArrayList<Location> house,pizza = new ArrayList<>();

    public void DFS(int L, int s){
        if(L==m){
            int sum = 0;
            for(Location hs : house){

            }
        }else{
           for(int i=s; i<len; i++){
               b[L] = i;
               DFS(L+1,i+1);
           }
        }
    }

    public static void main(String[] args) {
        Test14 T = new Test14();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n][n];
        b = new int[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                map[i][j] = sc.nextInt();
                if(map[i][j] == 1) house.add(new Location(i,j));
                else if(map[i][j] == 2) pizza.add(new Location(i,j));
            }
        }
        len = pizza.size();
        T.DFS(0,0);
        System.out.println(answer);
    }
}
