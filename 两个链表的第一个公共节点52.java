package SuanFa;

import java.util.HashSet;
import java.util.Set;

public class 两个链表的第一个公共节点52 {
    public static void main(String[] args) {

    }
     static ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA==null || headB==null){
            return null;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode cur = headA;
        while (cur!=null){
            set.add(cur);
            cur=cur.next;
        }
        cur=headB;
        while (cur!=null){
            if (set.contains(cur)){
                return cur;
            }else {
                cur=cur.next;
            }
        }
        return null;
     }
    static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA==null || headB==null){
            return null;
        }
        ListNode p = headA;
        ListNode q = headB;
        while (p!=q){
            p=p==null?headB:p.next;
            q=q==null?headA:q.next;
        }
        return p;
    }
}
