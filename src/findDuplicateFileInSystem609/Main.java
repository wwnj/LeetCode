package findDuplicateFileInSystem609;

import java.util.List;

/**
 * Created by wb on 2017/12/22.
 */
public class Main {
    public static void main(String[] args){
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)"
                , "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};
        Solution solution = new Solution();
        List<List<String>> res = solution.findDuplicate(paths);
        for(List<String> strList : res)
            for(String s : strList)
                System.out.println(s);
    }
}
