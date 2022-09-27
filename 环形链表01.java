package algorithm.September;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ListNode{
    int val;
    ListNode next;

    public ListNode() {

    }
    public ListNode(int val){
        this.val=val;
    }
}
public class 环形链表01 {
    public static void main(String[] args) {

    }
    public static boolean hasCycle1(ListNode head) {
        if (head==null){
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode cur = head;
        while (cur!=null){
            if (set.add(cur)){
               cur=cur.next;
            }else {
                return true;
            }
        }
        return false;
    }
    public boolean hasCycle(ListNode head){
        if (head==null || head.next==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if (fast==null||fast.next==null  ) {
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }



}
