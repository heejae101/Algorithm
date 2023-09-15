public class RecursiveFunction {

    // 1,2,3 출력하기
    public void DFS(int n){
        if(n == 0) return;
        else{
            // System.out.println(n+" "); // 3,2,1
            DFS(n-1);
            System.out.print(n+" "); // 1,2,3 7라인 까지 가고 다시 재귀함 계속 계속
            // 스택구조라 Last in First Out으로 DFS(3) -> DFS(2) -> DFS(1) -> DFS(0) 쌓이고
            // DFS(0) -> DFS(1) -> DFS(2) -> DFS(3) 으로 실행이 됩니다.

            // 개인 생각
            // 스택 프레임에 대해서 알아야함
            // 매겨변수 정보, 지역변수 정보, 복귀주소
            // 백 트래킹을 할 수 있다? 찾아보자

        }
    }
    public static void main(String[] args) {
        //자기가 자기자신을 호출하는 함수
        RecursiveFunction t = new RecursiveFunction();
        t.DFS(3);
    }
}
