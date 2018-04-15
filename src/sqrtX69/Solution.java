package sqrtX69;

/**
 * Created by wb on 2017/11/22.
 */
class Solution {
    public int mySqrt(int x) {
        long low=1;
        long high=x;
        while(low<=high){
            long mid=(high-low)/2+low;
            if(mid*mid==x){
                return (int)mid;
            }
            if(mid*mid>x){
                high=mid-1;
            }
            if(mid*mid<x){
                low=mid+1;
            }
        }
        return (int)high;
    }
}