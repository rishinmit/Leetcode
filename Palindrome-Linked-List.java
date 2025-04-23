/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
 class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> myList = new ArrayList<>();
        while(head!=null){
            myList.add(head.val);
            head = head.next;
        }
        StringBuilder sb = new StringBuilder();
        for(int num:myList){
            sb.append(num);
        }
        String str = sb.toString().replaceAll(\[\\\\[\\\\], ]\,\\);
        String revstr = sb.reverse().toString().replaceAll(\[\\\\[\\\\], ]\,\\);
        if(str.equals(revstr)){
            return true;
        }
        return false;
    }
}