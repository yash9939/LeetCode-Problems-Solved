class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length==0){
            return 0;
        }
        if(heights.length==1){
            return heights[0];
        }

        int[] left = nse_left(heights);
        int[] right = nse_right(heights);

        int ans = 0;
        for(int i=0; i<heights.length; i++){
            int res = right[i]-left[i]-1;
            ans = (ans>res*heights[i]) ? ans : res*heights[i];
        }

        return ans;
    }

    public int[] nse_left(int[] arr){
        int[] res = new int[arr.length];
        res[0] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for(int i=1; i<arr.length; i++){
            if(arr[st.peek()]<arr[i]){
                res[i] = st.peek();
                st.push(i);
            }
            else{
                while(!(st.isEmpty()) && arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    res[i] = -1;
                    st.push(i);
                }
                else{
                    res[i] = st.peek();
                    st.push(i);
                }
            }
        }

        return res;
    }

    public int[] nse_right(int[] arr){
        int[] res = new int[arr.length];
        res[arr.length-1] = arr.length;
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        for(int i = arr.length-2; i>=0; i--){
            if(arr[st.peek()]<arr[i]){
                res[i] = st.peek();
                st.push(i);
            }
            else{
                while(!(st.isEmpty()) && arr[st.peek()]>=arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    st.push(i);
                    res[i] = arr.length;
                }
                else{
                    res[i] = st.peek();
                    st.push(i);
                }
            }
        }

        return res;
    }
}