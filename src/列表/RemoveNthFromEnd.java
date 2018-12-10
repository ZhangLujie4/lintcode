package 列表;

/**
 * @author Tori
 * @version V1.1.0
 * @date 2018-12-10 14:50
 * @description
 */

public class RemoveNthFromEnd {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int x = 0;
        ListNode count = head;
        while (count!=null) {
            count = count.next;
            x++;
        }

        n = x-n;
        if (n==0) {
            return head.next;
        }
        if (n > 0) {
            int i = n;
            ListNode example = head;
            while(example.next != null) {
                ListNode before = example;
                example = example.next;
                i--;
                if (i==0) {
                    before.next = example.next;
                    break;
                }
            }
        }
        return head;
    }

    public void main() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ListNode result = removeNthFromEnd(l1, 1);
        while (result!=null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static void main(String[] args) {
        new RemoveNthFromEnd().main();
    }

}
