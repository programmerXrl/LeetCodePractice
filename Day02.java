package 比特笔试强训;

import java.util.Stack;

public class Day02 {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
    static class ListNode{
        int val;
        ListNode next;
        public ListNode(){

        }
        public ListNode(int val){
            this.val=val;
        }
    }
    public static int[] reversePrint(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode cur = head;
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        while (cur!=null){
            stack.push(cur.val);
            cur=cur.next;
            count++;
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i]=stack.pop();
        }
        return result;
    }
    public static String replaceSpace(String s) {
        StringBuilder stringBuffer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch!=' '){
                stringBuffer.append(ch);
            }else {
                stringBuffer.append("%20");
            }
        }
        return stringBuffer.toString();
    }
}
