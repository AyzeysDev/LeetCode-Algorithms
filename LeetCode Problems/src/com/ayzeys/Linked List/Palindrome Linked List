class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arrList = new ArrayList<>();
        
        ListNode current = head;
        
        while (current!= null) {
            arrList.add(current.val);
            current = current.next;
        }
        
        int front = 0;
        int back = arrList.size()-1;
        
        while (front < back) {
            if(!arrList.get(front).equals(arrList.get(back))) {
                return false;
            }
            front ++;
            back --;
        }
        return true;
    }
}