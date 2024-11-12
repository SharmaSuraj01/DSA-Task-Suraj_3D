public class Remove_Duplicates_from_Sorted_List_83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node= head;
        while(node!=null && node.next!= null){
                if(node.val==node.next.val){
                node.next=node.next.next;
                }else{
                    node=node.next;
                }
        }
            return head;
        }
    class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
