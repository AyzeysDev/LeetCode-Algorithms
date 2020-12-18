class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        int value = 0;
       // ListNode next = null;
        int dupCheck = 0;
        while (current != null && current.next != null) {
            value = current.val;
          //  next = current.next;
            dupCheck = current.next.val;
            if (value == dupCheck) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}