class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        ans = [0]*len(temperatures)
        st = []
        st.append(len(temperatures)-1)
        for i in range(len(temperatures)-2, -1, -1):
            if(temperatures[st[-1]]>temperatures[i]):
                ans[i] = st[-1] - i
                st.append(i)
            else:
                while(not(len(st)==0) and temperatures[st[-1]]<=temperatures[i]):
                    st.pop()
                if(len(st)==0):
                    st.append(i)
                else:
                    ans[i] = st[-1] - i
                    st.append(i)
        
        return ans