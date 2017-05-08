package com.linkedlists;

import java.util.Stack;

/**
 * Created by nbalkiss on 4/26/17.
 */
public class LinkedListOperations {

    public void printList(LinkedListNode node){
        while(node!=null){
            System.out.print(node.data + " ");
            node=node.next;
        }
    }

    public LinkedListNode createLinkedList(int[] arr){
        LinkedListNode root = builderHelper(arr,0);
        return root;
    }

    private LinkedListNode builderHelper(int[] arr, int i){
        if(i==arr.length){
            return null;
        }
        return new LinkedListNode(builderHelper(arr,i+1),arr[i]);
    }

    public boolean isPalindrome(LinkedListNode node){
        Stack<LinkedListNode> stk = new Stack<LinkedListNode>();
        LinkedListNode current = node;
        while(current!=null){
            stk.push(current);
            current=current.next;
        }

        //check is palindrome
        while(current!=null){
            if(current.data != stk.pop().data){
                return false;
            }
            current=current.next;
        }
        return true;
    }

    public LinkedListNode removeNthNodeFromEnd(LinkedListNode root, int n){
        LinkedListNode leader = root;
        LinkedListNode follower = root;

        int leaderIndex = 0;
        while(leader.next!=null){
            if(leaderIndex==n-1){
                follower = root;
            }
            if(leaderIndex>n-1){
                follower=follower.next;
            }
            leader=leader.next;
            leaderIndex++;
        }

        //edge cases

        //list shorter than n
        if(leaderIndex+1<n){
            return root;
        }
        //removing first item in list
        if(leaderIndex==n-1){
            return root.next;
        }
        follower.next = follower.next.next;
        return root;
    }

    public LinkedListNode reverseLinkedList(LinkedListNode root){
        LinkedListNode first = null;
        LinkedListNode second = root;
        LinkedListNode third = root.next;


        while(third!=null){
            second.next=first;
            first=second;
            second=third;
            third=third.next;
        }
        second.next=first;
        return second;
    }

    public LinkedListNode removeDuplicates(LinkedListNode root){
        LinkedListNode current = root;
        while(current.next!=null){
            if(current.next.data==current.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return root;
    }

}
