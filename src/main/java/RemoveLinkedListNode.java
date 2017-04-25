/**
 * Created by nbalkiss on 4/13/17.
 */
public class RemoveLinkedListNode {

    public class LinkedListNode{
        LinkedListNode next;
    }

    public int removeLinkedListNode(int size, int nodeToRemove){
        LinkedListNode root = new LinkedListNode();
        size--;
        LinkedListNode current = root;
        while(size>0){
            current.next = new LinkedListNode();
            current = current.next;
            size--;
        }

        current=root;
        LinkedListNode prev = root;
        nodeToRemove--;
        if(nodeToRemove==0){
            root=root.next;
        }
        while(nodeToRemove>0){
            prev=current;
            current=current.next;
            nodeToRemove--;
        }
        prev.next=current.next;
        return 0;

    }
}
