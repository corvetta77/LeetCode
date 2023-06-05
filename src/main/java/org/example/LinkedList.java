package org.example;


public class LinkedList {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ListNode ln1 = ll.createList(new int[]{1, 2, 4});
        ListNode ln2 = ll.createList(new int[]{1, 2, 3});

        ListNode result = ll.mergeTwoLists(ln1.next, ln2.next);
        printList(result);
    }

    private static void printList(ListNode result) {
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    private ListNode createList(int[] nodes) {
        var ln = new ListNode();
        var head = ln;
        for (int i = 0; i < nodes.length; i++) {
            ln.next = new ListNode(nodes[i]);
            ln = ln.next;
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ln = new ListNode();
        ListNode head = ln;
        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ln.next=list1;
                list1 = list1.next;
            } else {
                ln.next=list2;
                list2 = list2.next;
            }
            ln = ln.next;
        }
        if (list1 != null)
            ln.next= list1;
        if (list2 != null)
            ln.next= list2;

        return head.next;
    }

    private class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode() {

        }
    }
}
