package 比特笔试强训;

import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next;
    public ListNode(){

    }
    public ListNode(int value){
        val=value;
    }
}
public class Day03 {
    public static void main(String[] args) {
        Day03 day03 = new Day03();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        System.out.println(day03.kthToLast(l1, 2));
    }

    public int kthToLast(ListNode head, int k) {
        //head不为null k有效
        ListNode cur = head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (cur!=null){
            arrayList.add(cur.val);
            cur=cur.next;
        }
        int resultValIndex = arrayList.size()-k;
        return arrayList.get(resultValIndex);
    }
    public  int hammingWeight(int n) {
        //任何一位与1 进行& 操作 获得到这位数本身
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n&(1<<i))!=0){
                ret++;
            }
        }
        return ret;
    }
    public int fib(int n) {
        if(n==0){
            return n;
        }
        int f1 = 1;
        int f2 = 1;
        int result = 1;
        while(n>2){
            result=f1+f2;
            f1=f2;
            f2=result;
            n--;
        }
        return result;
    }
}
