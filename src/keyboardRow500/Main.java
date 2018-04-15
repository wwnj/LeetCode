package keyboardRow500;

/**
 * Created by wb on 2017/12/17.
 */
public class Main {
    public static void main(String[] args){
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        Solution solution = new Solution();
        String[] res = solution.findWords(words);
        for(String s:res){
            System.out.println(s);
        }
    }
}
