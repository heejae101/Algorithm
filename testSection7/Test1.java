package testSection7;

public class Test1 {
    // 1,2,3 출력하기
    public void BFS(int n){
        if(n==0) return;
        BFS(n-1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        Test1 T = new Test1();
        T.BFS(3);
    }
}
