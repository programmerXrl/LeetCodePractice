package 比特笔试强训;

public class Day04 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next=l2;
        l2.next=l3;

        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        l4.next=l5;
        l5.next=l6;
        Day04 day04 = new Day04();
        day04.PrintListNode(day04.mergeTwoLists(l1,l4));
    }
    public void PrintListNode(ListNode head){
        ListNode cur = head;
        while (cur!=null){
            System.out.print(cur.val+"->");
            cur=cur.next;
        }
        System.out.print("null");
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for (int i = 0; i < lists.length; i++) {
            ans=mergeTwoLists(ans,lists[i]);
        }
        return ans;
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null && l2==null){
            return null;
        }
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        //l1 l2 都存在
        ListNode head = new ListNode();
        ListNode headNode = head;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while (cur1!=null && cur2!=null){
            if (cur1.val<=cur2.val){
                headNode.next=cur1;
                cur1=cur1.next;
                headNode=headNode.next;
            }else {
                headNode.next=cur2;
                cur2=cur2.next;
                headNode=headNode.next;
            }
        }//跳出循环 L1 或 L2 一个为空
        headNode.next=cur1==null?cur2:cur1;
        return head.next;
    }
    public ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
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
}
