class Solution:
    def isValid(self, s: str) -> bool:
        if(len(s)%2!=0):
            return False
        
        stk = []
        for i in range(len(s)):
            if(s[i]==")" or s[i]=="}" or s[i]=="]"):
                if(len(stk)!=0):
                    if(s[i]==")" and stk[-1]!="("):
                        return False
                    elif(s[i]=="]" and stk[-1]!="["):
                        return False
                    elif(s[i]=="}" and stk[-1]!="{"):
                        return False
                    else:
                        stk.pop()
                    
                else:
                    return False
            else:
                stk.append(s[i])
        
        return len(stk)==0