class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []

        s1, s2, e1, e2 = 0, 0, len(matrix)-1, len(matrix[0])-1

        while(s1<=e1 and s2<=e2):
            for i in range(s2, e2+1):
                res.append(matrix[s1][i])
            
            for i in range(s1+1, e1+1):
                res.append(matrix[i][e2])
            
            if(s1<e1):
                for i in range(e2-1, s2-1, -1):
                    res.append(matrix[e1][i])
            
            if(s2<e2):
                for i in range(e1-1, s1, -1):
                    res.append(matrix[i][s1])
            
            s1+=1
            s2+=1
            e1-=1
            e2-=1
        
        return res