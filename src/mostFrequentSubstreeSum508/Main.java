package mostFrequentSubstreeSum508;

import utils.TreeNode;

/**
 * Created by wb on 2017/12/22.
 */
public class Main {
    public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(-5);
        Solution solution = new Solution();
        for(int i:solution.findFrequentTreeSum(root))
            System.out.println(i);
    }
}
