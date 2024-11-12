/*
Given the head of a singly linked list, return true if it is a 
palindrome or false otherwise.
Example 1:
Input: head = [1,2,2,1]
Output: true
Example 2:
Input: head = [1,2]
Output: false
Constraints:
The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 */
public class Palindrome_Linked_List_234 {
    public boolean isPalindrome(ListNode head) {
        ListNode node =head;
        int size=0,i=0;
        while(node!=null){
            node=node.next;
            size++;
        }
        int arr[] = new int [size];
        node=head;
        while(node!=null){
            arr[i++]=node.val;
            node=node.next;
        }
    return palindrom(arr);
    }
    public boolean palindrom(int [] arr)
    {
        int s=0,ls=arr.length-1;
        while(s<=ls){
            if(arr[s++]!=arr[ls--]) return false;
        }
        return true;
    }
}
