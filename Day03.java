package Level1;
class ListNode{
    int val;
    ListNode next;
    public ListNode(){

    }
    public ListNode(int val){
        this.val=val;
    }
}
public class Day03 {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        if (head==null) return head;
        if (head.next==null) return head;
        ListNode cur = head;
        ListNode pre = null;
        ListNode tmp = null;
        while (cur!=null){
            tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null && list2==null) return null;
        if (list1==null) return list2;
        if (list2==null) return list1;
        ListNode head = new ListNode();
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode curH = head;
        while (cur1!=null && cur2!=null){
            if (cur1.val<=cur2.val){
                curH.next=cur1;
                cur1=cur1.next;
                curH=curH.next;
            }else {
                curH.next=cur2;
                cur2=cur2.next;
                curH=curH.next;
            }
        }
        curH.next=cur1==null?cur2:cur1;
        return head.next;
    }
}
