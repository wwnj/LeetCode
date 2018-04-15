package topKFrequentWords692;

/**
 * Created by wb on 2018/1/5.
 */
public class Main {
    public static void main(String[] args){
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k=2;
        Solution solution = new Solution();
        for(String s:solution.topKFrequent(words,k))
            System.out.println(s);
    }
}
