import Packages.MathForProgramming;
import Packages.LeetCode;
import java.util.*;


class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Main {

    //Не входит в программу LeetCode
    static ListNode getListNode(int length){
        Scanner jIn = new Scanner(System.in);

        ListNode head = new ListNode(Integer.parseInt(jIn.nextLine()));
        ListNode end = head;

        for (int i = 1; i < length; i++){
            end.next = new ListNode(Integer.parseInt(jIn.nextLine()));
            end = end.next;
        }

        end.next = null;

        return head;
    }
    //Входит в LeetCode
    static ArrayList<Integer> convertListNodeInArrayList(ListNode head){
        ArrayList<Integer> arrayList = new ArrayList<>();

        ListNode end = head;

        do {
            arrayList.add(end.val);
            end = end.next;
        } while (end != null);

        return arrayList;
    }

    static boolean isPalindrome(ArrayList<Integer> arrayList){

        boolean isIt = true;

        for (int i = 0; i < arrayList.size()/2; i++){
            if (arrayList.get(i) == arrayList.get((arrayList.size() - 1) - i)){
                isIt = true;
            } else {
                return false;
            }
        }

        return isIt;
    }

    public static void main(String[] args) {
        int length = 4;
        ArrayList<Integer> arrayList = convertListNodeInArrayList(getListNode(length));

        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println(isPalindrome(arrayList));
    }
}