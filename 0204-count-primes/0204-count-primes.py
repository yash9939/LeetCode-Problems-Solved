class Solution:
    def countPrimes(self, n: int) -> int:
        if(n<=2):
            return 0
        
        isPrime = [False]*(n+1)
        isPrime[n] = True
        m = n//2

        for i in range(2, m+1):
            j = n//i
            for k in range(2, j+1):
                isPrime[i*k] = True
        
        cnt = 0
        for i in range(2, len(isPrime)):
            if(not(isPrime[i])):
                cnt+=1
        
        return cnt
        