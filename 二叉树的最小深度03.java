package algorithm.September;

public class 二叉树的最小深度03 {
    public static void main(String[] args) {

    }
    public static int minDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        if (root.left==null && root.right==null){
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if (root.left!=null){
            min=Math.min(min,minDepth(root.left));
        }
        if (root.right!=null){
            min=Math.min(min,minDepth(root.right));
        }
        return min+1;
    }
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
