package algorithm.October;

import javax.swing.tree.TreeNode;

public class 树的子结构01 {
    public static void main(String[] args) {

    }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A!=null&&B!=null) && (rec(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B));
    }
    public static boolean rec(TreeNode A,TreeNode B){
        if (B==null) return true;
        if (A==null || A.val!= B.val) return false;
        return rec(A.left,B.left) && rec(A.right,B.right);
    }
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
