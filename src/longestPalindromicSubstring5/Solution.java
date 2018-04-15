package longestPalindromicSubstring5;

/**
 * Created by wb on 2018/3/12.
 */
public class Solution {

    public String longestPalindrome(String s) {
        String result = "";
        int length = 0;
        for(int i=0;i<s.length();++i)
            for (int j=s.length()-1;j>=i+length;--j)
                if(isPalindromic(s.substring(i,j+1)))
                    if(j+1-i>length) {
                        length = j+1-i;
                        result = s.substring(i, j + 1);
                    }
        return result;
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
