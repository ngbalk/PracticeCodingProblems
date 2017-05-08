import com.linkedlists.LinkedListNode;
import com.linkedlists.LinkedListOperations;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by nbalkiss on 4/26/17.
 */
public class TestLinkedListOperations {
    private LinkedListOperations ops = new LinkedListOperations();



    @Test
    public void testIsPalindrome(){
        int[] arr = {1,2,3,4,5,4,3,2,1};
        LinkedListNode root = ops.createLinkedList(arr);
        Assert.assertTrue(ops.isPalindrome(root));
    }

    @Test
    public void testRemoveNthNodeFromEnd(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        LinkedListNode root = ops.createLinkedList(arr);
        root = ops.removeNthNodeFromEnd(root, 10);
        ops.printList(root);
    }

    @Test
    public void testReverseLinkedList(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        LinkedListNode root = ops.createLinkedList(arr);
        root = ops.reverseLinkedList(root);
        ops.printList(root);
    }

    @Test
    public void testRemoveDuplicates(){
        int[] arr = {1,1,1,1,2,2,2,3,3,3,4,4,4,4};
        LinkedListNode root = ops.createLinkedList(arr);
        root = ops.removeDuplicates(root);
        ops.printList(root);
    }
}
