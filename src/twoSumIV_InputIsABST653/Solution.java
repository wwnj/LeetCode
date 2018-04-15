package twoSumIV_InputIsABST653;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2017/11/26.
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        putInList(root,list);
        //System.out.println(list);
        for(int i=0;i<list.size()-1;i++){
            int low=i+1;
            int high=list.size()-1;
            while(low<=high){
                int mid=(high-low)/2+low;
                if(list.get(i)+list.get(mid)==k){
                    return true;
                }
                if(list.get(i)+list.get(mid)>k){
                    high=mid-1;
                }
                if(list.get(i)+list.get(mid)<k){
                    low=mid+1;
                }
            }
        }
        return false;
    }
    private void putInList(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        putInList(root.left,list);
        list.add(root.val);
        putInList(root.right,list);
    }
}