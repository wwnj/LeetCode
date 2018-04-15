package mostFrequentSubstreeSum508;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wb on 2017/12/22.
 */
public class Solution {
    private Map<Integer,Integer> map = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null)return new int[0];
        dfs(root);
        int max=0;
        List<Integer> list = new ArrayList<>();
        for(int key:map.keySet()){
            if(max<map.get(key)){
                max = map.get(key);
                list.clear();
                list.add(key);
            } else if(max==map.get(key))
                list.add(key);
        }
        int[] res = new int[list.size()];
        for(int i=0;i<res.length;++i)
            res[i]=list.get(i);
        return res;
    }
    private int dfs(TreeNode root){
        int res = root.val;
        if(root.left!=null)res+=dfs(root.left);
        if(root.right!=null)res+=dfs(root.right);
        int val = map.getOrDefault(res,0)+1;
        map.put(res,val);
        return res;
    }
}
