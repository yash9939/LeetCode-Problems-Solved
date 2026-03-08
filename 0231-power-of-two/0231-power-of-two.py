class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if(n<1):
            return False
        
        lo, hi = 0, 30
        while(lo<=hi):
            mid = lo + ((hi-lo)//2)
            if((2**mid)==n):
                return True
            elif((2**mid)<n):
                lo = mid+1
            else:
                hi = mid-1
        
        return False