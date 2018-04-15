package findAllAnagramsInAString438;

/**
 * Created by wb on 2018/1/9.
 */
public class Main {
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        Solution solution = new Solution();
        for(int i:solution.findAnagrams(s,p))
            System.out.println(i);
    }
}
