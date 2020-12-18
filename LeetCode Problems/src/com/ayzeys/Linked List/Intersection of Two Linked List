public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;
        
        while(currentA != currentB){
            if (currentA == null) {
                currentA = headA;
            } else {
                currentA = currentA.next;
            }
            if (currentB == null) {
                currentB = headB;
            } else {
                currentB = currentB.next;
            }
        }
        return currentA;
    }
}