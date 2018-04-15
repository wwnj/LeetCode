package replaceWords648;

import java.util.List;

/**
 * Created by wb on 2017/12/23.
 */
public class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        for(int i=0;i<dict.size()-1;++i){
            for(int j=i+1;j<dict.size();++j){
                if(dict.get(i).length()<=dict.get(j).length()){
                    if(dict.get(j).substring(0,dict.get(i).length()).equals(dict.get(i)))
                        dict.remove(j);
                }else{
                    if(dict.get(i).substring(0,dict.get(j).length()).equals(dict.get(j)))
                        dict.remove(i);
                }
            }
        }
        String[] strArray = sentence.split(" ");
        for(int i=0;i<strArray.length;++i){
            for(String s:dict){
                if(strArray[i].length()<s.length()){
                    continue;
                }
                if(strArray[i].substring(0,s.length()).equals(s)){
                    strArray[i]=s;
                    break;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(String s:strArray)
            stringBuilder.append(s).append(" ");
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return String.valueOf(stringBuilder);
    }
}
