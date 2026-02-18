class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        if(len(heights)==0):
            return 0
        if(len(heights)==1):
            return heights[0]
        
        left = self.nse_left(heights)
        right = self.nse_right(heights)

        ans = 0
        for i in range(len(heights)):
            val = right[i]-left[i]-1
            ans = max(ans, val*heights[i])

        return ans

    def nse_left(self, arr):
        res = [0]*len(arr)
        res[0] = -1
        st = [0]
        for i in range(1, len(arr)):
            if(arr[st[-1]]<arr[i]):
                res[i] = st[-1]
                st.append(i)
            else:
                while(not(len(st)==0) and arr[st[-1]]>=arr[i]):
                    st.pop()
                if(len(st)==0):
                    res[i] = -1
                    st.append(i)
                else:
                    res[i] = st[-1]
                    st.append(i)
        
        return res

    def nse_right(self, arr):
        res = [0]*len(arr)
        res[len(arr)-1] = len(arr)
        st = [len(arr)-1]
        for i in range(len(arr)-2, -1, -1):
            if(arr[st[-1]]<arr[i]):
                res[i] = st[-1]
                st.append(i)
            else:
                while(not(len(st)==0) and arr[st[-1]]>=arr[i]):
                    st.pop()
                if(len(st)==0):
                    res[i] = len(arr)
                    st.append(i)
                else:
                    res[i] = st[-1]
                    st.append(i)
        
        return res