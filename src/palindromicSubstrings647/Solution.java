package palindromicSubstrings647;

/**
 * Created by wb on 2018/3/12.
 */
public class Solution {

    public int countSubstrings(String s) {
        int count = 0;
        for (int i=0;i<s.length();++i)
            for(int j=i;j<s.length();++j){
                if(isPalindromic(s.substring(i,j+1)))
                    ++count;
            }
        return count;
    }

    private boolean isPalindromic(String s){
        int low = 0, high = s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high))
                return false;
            ++low;
            --high;
        }
        return true;
    }
}
