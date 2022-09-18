import java.util.*;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Main {

    static public ListNode getListNode(int length){
        ListNode head = new ListNode(1);
        ListNode end = head;

        for (int i = 2; i <= length; i++){
            end.next = new ListNode(i);
            end = end.next;
        }

        return head;
    }

    //LeetCode
    static public int getMiddlePosition(ListNode listNode){
        int counter = 0;

        while (listNode != null){
            counter++;
            listNode = listNode.next;
        }

        return counter / 2 + 1;
    }
    public static void main(String[] args) {
        Scanner jIn = new Scanner(System.in);
        int n = Integer.parseInt(jIn.nextLine());
        ListNode listNode = getListNode(n);

        int middle = getMiddlePosition(listNode);

        for (int i = 1; i < middle; i++){
            listNode = listNode.next;
        }

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}