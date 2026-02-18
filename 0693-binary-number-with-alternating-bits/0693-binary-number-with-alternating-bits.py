class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        binary = self.getBinary(n)
        
        for i in range(1, len(binary)):
            if(binary[i]=="0"):
                if(binary[i-1]!="1"):
                    return False
            else:
                if(binary[i-1]!="0"):
                    return False
        
        return True
    
    def getBinary(self, n):
        res = ""
        while(n>1):
            rem = n%2
            res = str(rem)+res
            n= n//2
        
        res = "1"+res
        return res