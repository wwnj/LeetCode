package averageOfLevelsInBinaryTree637;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2017/11/24.
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<Double>();
        List<Integer> countList = new ArrayList<>();
        average(root,0,list,countList);
//        if(root!=null){
//            list.add(root.val+0.0);
//            countList.add(1);
//            int index = list.size();
//            if(root.left!=null){
//                for(double d : averageOfLevels(root.left)){
//                    list.add(d);
//                    countList.add(1);
//                }
//            }
//            if(root.right!=null){
//                for(double d : averageOfLevels(root.right)){
//                    if (list.size() > index) {
//                        list.set(index, list.get(index) + d);
//                        countList.set(index, countList.get(index) + 1);
//                        index++;
//                    } else {
//                        list.add(d);
//                        countList.add(1);
//                        index++;
//                    }
//                }
//            }
//        }
        for(int i=0;i<list.size();i++){
            list.set(i,list.get(i)/countList.get(i));
        }
        return list;
    }
    private void average(TreeNode t,int i,List<Double> list,List<Integer> countList){
        if(t==null){
            return;
        }
        if(i<list.size()){
            list.set(i,list.get(i)+t.val);
            countList.set(i,countList.get(i)+1);
        }else{
            list.add(t.val+0.0);
            countList.add(1);
        }
        average(t.left,i+1,list,countList);
        average(t.right,i+1,list,countList);
    }
}
