package com.para.leetcode.link;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        ListNode temp = this;
        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }
        return sb.reverse().toString();
    }
}

public class LeetCode002 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;

        ListNode newHead = new ListNode(0);
        ListNode head3 = newHead;


        boolean carry = false;
        while (head1 != null || head2 != null) {
            int x = head1 != null ? head1.val : 0;
            int y = head2 != null ? head2.val : 0;

            int sum = carry ? x + y + 1 : x + y;

            if(sum >= 10) {
                sum -= 10;
                carry = true;
            } else {
                carry = false;
            }
            head3.next = new ListNode(sum % 10);
            head3 = head3.next;

            if(head1 != null) head1 = head1.next;
            if(head2 != null) head2 = head2.next;
        }
        if(carry) {
            head3.next = new ListNode(1);
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 4, 3};
        int[] nums2 = {5, 6, 4};
        System.out.println(addTwoNumbers(buildNode(nums1), buildNode(nums2)));

    }

    public static ListNode buildNode(int[] nums) {
        ListNode listNode = new ListNode(0);
        ListNode temp = listNode;
        for(int i=0; i < nums.length; i ++) {
            temp.next = new ListNode(nums[i]);
            temp = temp.next;
        }
        return listNode.next;
    }
}
