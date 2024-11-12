/*Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.
After doing so, return the head of the final linked list.  You may return any such answer.
(Note that in the examples below, all sequences are serializations of ListNode objects.)
Example 1:
Input: head = [1,2,-3,3,1]
Output: [3,1]
Note: The answer [1,2,1] would also be accepted.
Example 2:
Input: head = [1,2,3,-3,4]
Output: [1,2,4]
Example 3:
Input: head = [1,2,3,-3,-2]
Output: [1]
Constraints:
The given linked list will contain between 1 and 1000 nodes.
Each node in the linked list has -1000 <= node.val <= 1000
 */

import java.util.ArrayList;
import java.util.List;

public class Remove_Zero_Sum_Consecutive_Nodes_from_Linked_List_1171 {
    // best solution
    public ListNode removeZeroSumSublists1(ListNode head) {
        if(head == null)return head;
        ListNode prev = null;
        ListNode cur = head;
        int  running_sum=0;
        while(cur!=null)
        {
            running_sum += cur.val;
            if(running_sum==0)
            {
                if(prev == null)
                head = cur.next;
                else
                prev.next = cur.next;
                return removeZeroSumSublists1(head);
            }
            cur = cur.next;
        }
        head.next = removeZeroSumSublists1(head.next);
        return head;
    }
    // bruteforce
     public ListNode removeZeroSumSublists2(ListNode head) {
        if(head==null) return null;
        int len =size(head);
        List<Integer> arr = new ArrayList<>();
        ListNode node =head;
        for(int i=0;i<len;i++){
            arr.add(node.val);
            node=node.next;
        }
        subarray(arr);
        if(arr.size()==0){
            return null;
        }
        else{
            head.val = arr.get(0);
            node=head;
            for(int i=1;i<arr.size();i++){
                node.next.val=arr.get(i);
                node=node.next;
            }
            node.next=null;
        }
        System.out.println(arr);
        return head;
    }
    public int size(ListNode head){
        int len =0;
        while(head!=null){
            head=head.next;
            len++;
        }
        return len;
    }
    public void subarray(List<Integer> arr){
        for(int i=0;i<arr.size();){
            int sum=0;
            boolean flag=false;
            for(int j=i;j<arr.size();j++){
                sum+=arr.get(j);
                // System.out.println(sum +" "+ i+" "+j);
                if(sum==0){
                // System.out.println(sum +" "+ i+" "+j);
                    remove(arr,i,j);
                    flag=true;
                    break;
                }
            }
            if(flag){
                i=0;
            }
            else i++;
        }  
    }
    public void remove(List<Integer> arr,int start, int end){
        int count = end - start+1;
        // System.out.println(start +" " + end);
        while(count--!=0){
                // System.out.println(arr.get(start));
            arr.remove(start);
        }
    }

}