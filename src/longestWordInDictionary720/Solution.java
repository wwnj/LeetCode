package longestWordInDictionary720;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by wb on 2018/1/5.
 */
public class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> set = new HashSet<>();
        for(String s:words){
            if(s.length()==1){
                set.add(s);
            }else if(set.contains(s.substring(0,s.length()-1))){
                set.add(s);
            }
        }
        if(set.size()==0){
            return "";
        }else{
            String result = "";
            for(String s:set){
                if(result.length()<s.length()){
                    result = s;
                }else if(result.length() == s.length()){
                    result = result.compareTo(s)<0?result:s;
                }
            }
            return result;
        }
    }
}
