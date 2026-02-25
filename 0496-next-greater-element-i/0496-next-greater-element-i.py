class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        hm = {}
        st = []

        for i in range(len(nums2)-1, -1, -1):
            while(not(len(st)==0) and st[-1]<=nums2[i]):
                st.pop()
            if(len(st)==0):
                hm[nums2[i]] = -1
            else:
                hm[nums2[i]] = st[-1]
            st.append(nums2[i])
        
        ans = [0]*len(nums1)
        for i in range(len(nums1)):
            ans[i] = hm[nums1[i]]
        
        return ans