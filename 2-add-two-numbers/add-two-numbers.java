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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head=new ListNode(0);
    ListNode current=head;
    int carry=0;
    while(l1!=null||l2!=null||carry!=0)
    {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10; // Calculate the carry for the next iteration
            int digitSum = sum % 10; // Get the current digit for the result node

            current.next = new ListNode(digitSum); // Create a new node with the digitSum
            current = current.next; // Move the current pointer to the newly created node

            if (l1 != null) {
                l1 = l1.next; // Advance l1 if it's not null
            }
            if (l2 != null) {
                l2 = l2.next; // Advance l2 if it's not null
            }
        }

        return head.next;
    
    }
}