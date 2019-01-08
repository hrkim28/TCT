package helper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * ===========================================
 * System Name : LGE GPDM Project
 * Program ID : DomHelper.java
 * ===========================================
 * Modify Date    Modifier    Description
 * -------------------------------------------
 * 2015. 1. 17.  yongsik1.kim   Initial
 * ===========================================
 */

/**
 * <pre>
 * Class : DomHelper
 * Description : TODO
 * </pre>
 *
 * @author yongsik1.kim
 */
public class LeeJinKyoung_20170216 {

    static List<HashMap> result = new ArrayList<HashMap>();

    public static void main(String[] args) throws Exception{

        /*
            주희는 심심해서 다음과 같이 수를 쓰기 시작 했다.
            [그림은 파일 참조]
            이렇게 수를 쓰는 경우 어떤 수가 몇 층에 있는지가 궁금해 졌다.
            참고로 100 은 7 층에 존재 한다.
            입력
            32 비트 정수 범위내의 값이 입력으로 주어진다.
            출력
            층 수를 출력한다.
            입출력 예
            입력
            100
            출력
            7
            */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name;
        while ( true ) {
            name = in.readLine();
            if ( name == null || name.length() == 0 ) {
                continue;
            }
            //System.out.println();
            break;
        }

        generator(name);
    }

    public static void generator(String input) throws Exception{
/** 이진트리 알고리즘...
package BST;

public class TreeNode {
    char data;
    TreeNode left;
    TreeNode right;

    public TreeNode(){
        this.left = null;
        this.right = null;
    }

    public TreeNode(char data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Object getData(){
        return data;
    }
}

public class BinarySearchTree {
    private TreeNode root = new TreeNode();

    public TreeNode insertKey(TreeNode root, char x) {
        TreeNode p = root;
        TreeNode newNode = new TreeNode(x);

        if(p==null){
            return newNode;
        }else if(p.data>newNode.data){
            p.left = insertKey(p.left, x);
            return p;
        }else if(p.data<newNode.data){
            p.right = insertKey(p.right, x);
            return p;
        }else{
            return p;
        }
    }

    public void insertBST(char x){
        root = insertKey(root, x);
    }

    public TreeNode searchBST(char x){
        TreeNode p = root;
        while(p!=null){
            if(x<p.data) p = p.left;
            else if(x>p.data) p = p.right;
            else return p;
        }
        return p;
    }

    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public void printBST(){
        inorder(root);
        System.out.println();
    }
}

public class Test {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insertBST('G');
        bst.insertBST('I');
        bst.insertBST('H');
        bst.insertBST('D');
        bst.insertBST('B');
        bst.insertBST('M');
        bst.insertBST('N');
        bst.insertBST('A');
        bst.insertBST('J');
        bst.insertBST('E');
        bst.insertBST('Q');

        System.out.println("Binary Tree >>>");
        bst.printBST();

        System.out.println("Is There \"A\" ? >>> ");
        TreeNode p1 = bst.searchBST('A');
        if(p1!=null){
            System.out.println(p1.data + " 탐색 성공");
        }else{
            System.out.println("탐색 실패");
        }

        System.out.println("Is There \"Z\" ? >>> ");
        TreeNode p2 = bst.searchBST('Z');
        if(p2!=null){
            System.out.println(p2.data + " 탐색 성공");
        }else{
            System.out.println("탐색 실패");
        }
    }
}


출처: http://songeunjung92.tistory.com/31 [내 태몽 거북이]
*/
    }
}
