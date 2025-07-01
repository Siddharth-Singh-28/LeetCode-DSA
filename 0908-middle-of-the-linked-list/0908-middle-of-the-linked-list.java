/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 1;
        ListNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
            size++;
        }
        if(size==1){
            return head;
        }
        if(size==2){
            return head.next;
        }
        for(int i=0; i<=size/2; i++){
            if(i==size/2){
                return head;
            }
            head = head.next;
        }

        return head;
    }
}