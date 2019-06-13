package com.leet.code.arithmetic;

import java.util.HashMap;
import java.util.Map;

/**
 * 类说明：
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author janita
 * @since 2019-06-10 - 20:52
 */
public class AddTwoNumbers {

    private static class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static ListNode addTwoNums(ListNode la, ListNode lb) {
        int laNum = convertListNodeToNum(la);
        int lbNum = convertListNodeToNum(lb);
        int result = laNum + lbNum;
        return convertNumToListNode(result);
    }

    private static ListNode convertNumToListNode(int result) {
        return null;
    }

    private static int convertListNodeToNum(ListNode node) {
        if (node == null) {
            return 0;
        }
        if (node.val == 0) {
            return 0;
        }
        int nodeLen = 1;
        ListNode tem = node.next;
        while (tem != null) {
            tem = node.next;
            nodeLen ++;
        }
        int[] ints = new int[nodeLen];
        tem = node.next;
        int index = 0;
        while (tem != null) {
            ints[index] = tem.val;
        }
        return 0;
    }

    public static void main(String[] args) {
        // ListNode node = new ListNode(1);
        // node.next = new ListNode(2);
        // node.next.next = new ListNode(3);
        //
        // ListNode node2 = new ListNode(2);
        // node2.next = new ListNode(3);
        // System.out.println(addTwoNumbers(node, node2).val);
        Map<Long, Integer> map = new HashMap<>();
        map.put(1L, null);
        map.put(2L, null);
        System.out.println(map);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(-1);
        ListNode ans = ret;
        boolean add = false;
        while(l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = add ? x + y + 1 : x + y;
            if(sum >= 10){
                add = true;
                sum -= 10;
            }else
                add = false;
            ListNode node = new ListNode(sum);
            ret.next = node;
            ret = ret.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if(add){
            ret.next = new ListNode(1);
        }
        return ans.next;
    }

}
