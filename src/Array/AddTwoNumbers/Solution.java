package Array.AddTwoNumbers;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public static void main(String[] args) {
        ListNode l1 = addNumbers(new int[]{2, 4, 3});
        ListNode l2 = addNumbers(new int[]{5, 6, 4});
        printListNode(l1);
        printListNode(l2);
        ListNode l3 = addTwoNumbers(l1, l2);
        printListNode(l3);
    }
    public static void printListNode(ListNode l){
        while (l.next != null) {
            System.out.print(l.val);
            l = l.next;
        }
        System.out.println(l.val);
    }
    public static ListNode addNumbers(int[] nums) {
        ListNode result = new ListNode();
        ListNode l = result;
        for (int i=0;i<nums.length;i++) {
            assert l != null;
            l.val = nums[i];
            l.next = i == nums.length -1 ? null : new ListNode();
            l = l.next;
        }
        return result;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode l;
        l = result;
        int i1, i2, i3 = 0;
        while (l1 !=null || l2 != null){
            i1 = l1 != null ? l1.val : 0;
            i2 = l2 != null ? l2.val : 0;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            l.val = (i1 + i2 + i3) % 10;
            i3 = (i1 + i2 + i3) / 10;
            l.next = l1 ==null && l2 == null && i3 != 1 ? null : new ListNode();
            l = l.next;
        }
        if (i3 == 1) {
            l.val = 1;
            l.next = null;
        }
        return result;
    }
}