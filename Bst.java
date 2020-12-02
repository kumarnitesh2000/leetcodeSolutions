import java.util.ArrayList;
import java.util.List;

public class Bst {
    public static List<Integer> inorder(TreeNode root, List<Integer> res){
        if(root==null){
            return res;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
        return res;
    }
    public static boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> inorder = inorder(root,list);

        for(int i=0;i<inorder.size()-1;i++){
            if(inorder.get(i)>=inorder.get(i+1)){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        //create a tree for our testCase
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        
        boolean res = isValidBST(root);
        System.out.println(res);
    }
}
