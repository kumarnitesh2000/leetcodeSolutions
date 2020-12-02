public class DepthBinaryTree {
    //note The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
    public static int minDepth(TreeNode root) {
        int left,right;
        if(root==null){
            return 0;
        }
        //handle leaf node case
        if(root.left==null && root.right==null){
            return 0;
        }
        if(root.left!=null){
           left = minDepth(root.left);
        }
        else{
           left = Integer.MAX_VALUE;
        }
        if(root.right!=null){
           right = minDepth(root.right);
        }
        else{
           right = Integer.MAX_VALUE;
        }
        return Math.min(left, right)+1;
    }
    public static void main(String[] args) {
         //create a tree for our testCase
         TreeNode root = new TreeNode(3);
         root.left = new TreeNode(9);root.right = new TreeNode(20);
         root.right.left=new TreeNode(15);root.right.right = new TreeNode(7);
         int res = minDepth(root);
         System.out.println(res);
        
    }
}
