package wordPattern290;

/**
 * Created by wb on 2018/1/10.
 */
public class Main {
    public static void main(String[] args){
        String pattern = "abba";
        String str = "dog do do dog";
        Solution solution = new Solution();
        System.out.println(solution.wordPattern(pattern,str));
    }
}
