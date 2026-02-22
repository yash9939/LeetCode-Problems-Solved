class Solution:
    def binaryGap(self, n: int) -> int:
        binary = self.Binary(n)
        
        i, j, cnt = 0, 1, 0
        while(j<len(binary)):
            if(binary[j]=="0"):
                j+=1
            else:
                cnt = max(cnt, (j-i))
                i = j
                j += 1
        
        return cnt

    def Binary(self, n):
        res = ""

        while(n>1):
            rem = n%2
            res = str(rem)+res
            n = n//2
        
        res = "1"+res
        
        return res