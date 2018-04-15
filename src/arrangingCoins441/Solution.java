package arrangingCoins441;

/**
 * Created by wb on 2017/11/22.
 */
class Solution {
    public int arrangeCoins(int n) {
        int index = 1;
        while(n>=index){
            n -= index;
            index++;
        }
        return --index;
    }
}
