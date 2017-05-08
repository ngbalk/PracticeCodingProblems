import java.util.*;

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

        // initialize Queued as LinkedList
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        // add root
        q.add(root);
        // mark finished root level
        q.add(null);

        while(true){
            TreeNode cur = q.remove();

            // new level
            if(cur==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                q.add(null);
            }

            // node of same level
            else{
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

    public void printLevelsZigZag(){

        // initialize Queued as LinkedList
        Queue<TreeNode> q = new LinkedList<TreeNode>();

        List<TreeNode> buffer = new ArrayList<TreeNode>();
        int level = 0;

        // add root
        q.add(root);
        // mark finished root level
        q.add(null);

        while(true){
            TreeNode cur = q.remove();

            // new level
            if(cur==null){
                System.out.println();

                if(level%2==0){
                    for(int i=0;i<buffer.size();i++){
                        System.out.print(buffer.get(i).value + " ");
                    }
                }
                else{
                    for(int i=buffer.size()-1;i>=0;i--){
                        System.out.print(buffer.get(i).value + " ");
                    }
                }

                if(q.isEmpty()){
                    break;
                }
                buffer.clear();
                q.add(null);
                level++;
            }

            // node of same level
            else{

                buffer.add(cur);

                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
        }
    }

    public void verticlePrintTree(){

        Map<Integer, List<TreeNode>> columnMap = new HashMap<>();

        //DFS tree
        verticleHelper(root,0,columnMap);

        Object[] groups = columnMap.keySet().toArray();
        Arrays.sort(groups);
        for(Object o : groups){
            Integer group = (Integer) o;
            for(TreeNode node : columnMap.get(group)){
                System.out.print(node.value + " ");
            }
            System.out.println();
        }

    }

    private void verticleHelper(TreeNode node, int offset, Map<Integer,List<TreeNode>> columnMap){
        if(node==null){
            return;
        }
        List<TreeNode> group = columnMap.get(offset);
        if(group==null){
            group = new ArrayList<>();
        }
        group.add(node);
        columnMap.put(offset,group);
        verticleHelper(node.left, offset-1,columnMap);
        verticleHelper(node.right,offset+1,columnMap);
    }

}
