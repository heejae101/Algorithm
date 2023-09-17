import com.sun.tools.javac.Main;

class Node{
    int data;
    Node lt,rt;
    public Node(int val){
        data = val;
        lt=rt=null;
    }
}
// 이진트리 순회(깊이 우선 탐색)
public class RecursiveFunction5 {
    Node root;
    public void DFS(Node root){
        if(root == null) return;
        else{
//            System.out.print(root.data+" "); // 전위순회
            DFS(root.lt);
            System.out.print(root.data+" "); // 중위순회
            DFS(root.rt);
//            System.out.println(root.data+" "); // 후위순회
        }
    }

    public static void main(String[] args) {
        RecursiveFunction5 tree = new RecursiveFunction5();
        tree.root = new Node(1); // 1 lt rt = null
        tree.root.lt = new Node(2); // root주소의 lt를 2
        tree.root.rt = new Node(3); // root주소의 rt를 3
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
