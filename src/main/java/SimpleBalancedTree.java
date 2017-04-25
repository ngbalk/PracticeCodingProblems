import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nbalkiss on 4/13/17.
 */
public class SimpleBalancedTree {

    TreeNode root;

    public SimpleBalancedTree(int size){
        root = new TreeNode(size);
        size--;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(size > 0){
            TreeNode current = q.poll();
            current.left = new TreeNode(size);
            q.add(current.left);
            size--;
            if(size>0){
                current.right = new TreeNode(size);
                q.add(current.right);
                size--;
            }
        }
    }

    public void preOrderPrintTree(){
        preOrder(root);
    }
    private void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrderPrintTree(){
        postOrder(root);
    }
    private void postOrder(TreeNode root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }

    public void inOrderPrintTree(){
        inOrder(root);
    }
    private void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public void printLevels(){
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        while(true){
            TreeNode cur = q.poll();
            if(cur==null){
                if(q.size()==0){
                    return;
                }
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(cur.value + " ");
            if(cur.left!=null){
                q.add(cur.left);
            }
            if(cur.right!=null){
                q.add(cur.right);
            }
        }
    }
}
