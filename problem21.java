public class probelm21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merge = new ListNode(0);
        ListNode temp = merge;
        while (list1 != null || list2 != null) {
            int val1 = (list1 != null) ? list1.val : Integer.MAX_VALUE;
            int val2 = (list2 != null) ? list2.val : Integer.MAX_VALUE;
    
            if (val1 <= val2) {
                temp.next = new ListNode(val1);
                if (list1 != null) {
                    list1 = list1.next;
                }
            } else {
                temp.next = new ListNode(val2);
                if (list2 != null) {
                    list2 = list2.next;
                }
            }
            temp = temp.next;
        }
        return merge.next;
    }
}
