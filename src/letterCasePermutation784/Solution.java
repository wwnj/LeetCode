package letterCasePermutation784;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2018/3/6.
 */
public class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        char[] chars = S.toCharArray();
        int index = 0;
        backtrack(result,S,chars,index);
        return result;
    }

    private void backtrack(List<String> result,String S,char[] chars,int index){
        if(index>=chars.length){
            result.add(new String(chars));
            return;
        }
        backtrack(result,S,chars,++index);
        --index;
        if(Character.isLowerCase(chars[index])){
            chars[index]=Character.toUpperCase(chars[index]);
            backtrack(result,S,chars,++index);
            --index;
        }else if(Character.isUpperCase(chars[index])){
            chars[index]=Character.toLowerCase(chars[index]);
            backtrack(result,S,chars,++index);
            --index;
        }
    }
}
