package invertBinaryTree226;

import java.util.*;

/**
 * Created by wb on 2017/11/26.
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Stack<TreeNode> stack = new Stack<>();
            Queue<TreeNode> temp = new LinkedList<>();
            while(!queue.isEmpty()){
                TreeNode t = queue.remove();
                TreeNode left = t.left;
                t.left = t.right;
                t.right = left;
                if(t.left!=null) temp.add(t.left);
                if(t.right!=null) temp.add(t.right);
            }
            queue = temp;
        }
        return root;
    }
}
