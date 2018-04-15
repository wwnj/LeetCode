package replaceWords648;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wb on 2017/12/23.
 */
public class Main {
    public static void main(String[] args){
        List<String> dict = new ArrayList<>();
        dict.add("cat");
        dict.add("bat");
        dict.add("rat");
        String sentence = "the cattle was rattled by the battery";
        Solution solution = new Solution();
        System.out.println(solution.replaceWords(dict,sentence));
    }
}
