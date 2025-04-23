class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> myList = new ArrayList<>();
        while(list1 != null){
            myList.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null){
            myList.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(myList);
        ListNode dum = new ListNode(0);
        ListNode curr = dum;
        for(int i : myList){
            curr.next = new ListNode(i);
            curr = curr.next;
        }
        return dum.next;
    }
}