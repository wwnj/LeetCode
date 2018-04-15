package constructStringfromBinaryTree606;


/**
 * Created by wb on 2017/11/26.
 */
class Solution {
    public String tree2str(TreeNode t) {
        String res = "";
        return tree2Str(t, res);
    }

    private String tree2Str(TreeNode t, String res) {
        if (t == null) {
            return res;
        }
        boolean start = false;
        if ("".equals(res)) {
            res += t.val;
            start = true;
        } else {
            res += "(" + t.val;
        }
        boolean flag = false;
        if (t.left != null) {
            res = tree2Str(t.left, res);
        } else {
            flag = true;
        }
        if (t.right != null) {
            if (flag) {
                res += "()";
            }
            res = tree2Str(t.right, res);
        }
        if(!start){
            res += ")";
        }
        return res;
    }
}