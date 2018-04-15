package groupAnagrams49;

/**
 * Created by wb on 2018/1/8.
 */
public class Main {
    public static void main(String[] args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution solution = new Solution();
        System.out.println(solution.groupAnagrams(strs));
    }
}
