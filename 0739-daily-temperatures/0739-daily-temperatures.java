class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        st.push(temperatures.length-1);
        for(int i=temperatures.length-2; i>=0; i--){
            if(temperatures[st.peek()]>temperatures[i]){
                ans[i] = st.peek()-i;
                st.push(i);
            }
            else{
                while(!(st.isEmpty()) && temperatures[st.peek()]<=temperatures[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    ans[i] = st.peek()-i;
                    st.push(i);
                }
            }
        }

        return ans;
    }
}