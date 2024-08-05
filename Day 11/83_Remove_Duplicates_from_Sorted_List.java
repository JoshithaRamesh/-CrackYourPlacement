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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode temp = head;
        ListNode temp2 = head.next;
        int last = head.val;
        while(temp2 != null){ 
            if(temp2.val == last){ 
                if(temp2.next == null){ 
                    temp.next = null;
                    break;
                }
                temp2 = temp2.next; 
                temp.next = temp2; 
            }
            else{ 
                temp = temp2; 
                last = temp.val;
                temp2 = temp2.next;
            }
        }
        return head;
    }
}
