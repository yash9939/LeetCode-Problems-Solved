class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        st = []
        for i in range(len(asteroids)):
            if(len(st)==0 or asteroids[i]>=0):
                st.append(asteroids[i])
            else:
                if(st[-1]>=0):
                    while(not(len(st)==0) and st[-1]<abs(asteroids[i])):
                        if(st[-1]<0):
                            break
                        st.pop()
                    if(not(len(st)==0) and st[-1]==abs(asteroids[i])):
                        st.pop()
                        continue
                    if(len(st)==0 or st[-1]<0):
                        st.append(asteroids[i])
                else:
                    st.append(asteroids[i])
        return st 
