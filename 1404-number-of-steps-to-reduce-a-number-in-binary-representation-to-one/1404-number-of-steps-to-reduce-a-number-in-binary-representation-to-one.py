class Solution:
    def numSteps(self, s: str) -> int:
        cnt = 0

        while(s!="1"):
            if(s[len(s)-1]=="1"):
                s = self.add(s)
                cnt+=1
            else:
                s = s[:len(s)-1]
                cnt+=1
        
        return cnt

    def add(self, s):
        carry = 1
        res = ""
        for i in range(len(s)-1, -1, -1):
            if((s[i]=="1" and carry==1) or (s[i]=="0" and carry==0)):
                res = "0"+res
            else:
                res = "1"+res
                carry = 0
        
        if(carry==1):
            res = "1"+res

        return res        
        