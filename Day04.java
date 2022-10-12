package Level1;

public class Day04 {
    public static void main(String[] args) {
        Day04 tool = new Day04();
        ListNode h1 = new ListNode(3);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(0);
        ListNode h4 = new ListNode(-4);
        ListNode h5 = new ListNode(5);
        ListNode h6 = new ListNode(6);
        h1.next=h2;
        h2.next=h3;
        h3.next=h4;
        h4.next=h2;
        System.out.println(tool.detectCycle(h1).val);
    }
    public void printList(ListNode head){
        ListNode cur = head;
        while (cur!=null){
            System.out.print(cur.val+"->");
            cur=cur.next;
        }
        System.out.print("null");
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        if (head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null){
            slow = slow.next;
            if (fast.next!=null){
                fast=fast.next.next;
            }else {
                return null;
            }
            if (fast==slow){
                ListNode ptr = head;
                while (ptr!=slow){
                    ptr=ptr.next;
                    slow=slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
