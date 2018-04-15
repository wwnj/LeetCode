package findDuplicateFileInSystem609;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wb on 2017/12/22.
 */
public class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String s:paths){
            String[] str = s.split(" ");
            for(int i=1;i<str.length;++i){
                Pattern pattern = Pattern.compile("(?<=\\()\\S+(?=\\))");
                Matcher matcher = pattern.matcher(str[i]);
                String content = null;
                if(matcher.find()){
                    content = matcher.group();
                }
                pattern = Pattern.compile("(\\S+(?=\\())");
                matcher = pattern.matcher(str[i]);
                String name = null;
                if(matcher.find()){
                    name = matcher.group();
                }
                name = str[0]+"/"+name;
                List<String> list = new ArrayList<>();
                list = map.getOrDefault(content,list);
                list.add(name);
                map.putIfAbsent(content,list);
            }
        }
        for(List<String> listStr:map.values())
            if(listStr.size()>1)
                res.add(listStr);
        return res;
    }
}
