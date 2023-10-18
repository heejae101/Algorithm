package section7;

// 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램
public class RecursiveFunction6 {
    static int n; // main에서 접근하려고 static 을 사용
    static int[] ch; // 부분집합으로 사용하는지 안하는지 확인하기 위한

    public void DFS(int L){
        if(L==n+1){ // 종착점
            String tmp = "";
            for(int i=1; i<=n; i++){
                if(ch[i] == 1) tmp +=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        }else{
            ch[L] = 1; // ch의 idx를 숫자로 생각하면 된다.
            DFS(L+1); // 사용한다
            ch[L] = 0;
            DFS(L+1); // 사용하지 않는다.
        }
    }
    public static void main(String[] args) {
        RecursiveFunction6 T = new RecursiveFunction6();
        n=3;
        ch=new int[n+1]; // 0은 사용안할꺼
        T.DFS(1);
    }
}
