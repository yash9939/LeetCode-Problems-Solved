class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        
        int lo = 0, hi = 30;
        while(lo<=hi){
            int mid = lo + ((hi-lo)/2);
            if((int)Math.pow(2, mid) == n){
                return true;
            }
            else if((int)Math.pow(2, mid) < n){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }

        return false;
    }
}