
public class KthsmallElem {
    static int count=0;
    
    public static int kthSmallest(TreeNode root, int k)
    {
 
        if (root == null)
            return 0;

        int left = kthSmallest(root.left, k);

        if (left !=0)
            return left;

        count++;
        if (count == k)
            return root.val;

        return kthSmallest(root.right, k);
    }
                
    public static void main(String[] args) {
         //create a tree for our testCase
         TreeNode root = new TreeNode(5);
         root.left = new TreeNode(3);root.right = new TreeNode(6);
         root.left.left = new TreeNode(2);root.left.right=new TreeNode(4);
         root.left.left.left = new TreeNode(1);
         int res = kthSmallest(root,3);
         System.out.println(res);
    }

}
