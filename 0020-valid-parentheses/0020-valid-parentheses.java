class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                if(!st.isEmpty()){
                    if(s.charAt(i)==')' && st.peek()!='('){
                        return false;
                    }
                    if(s.charAt(i)==']' && st.peek()!='['){
                        return false;
                    }
                    if(s.charAt(i)=='}' && st.peek()!='{'){
                        return false;
                    }
                    else{
                        st.pop();
                    }
                }
                else{
                    return false;
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }

        return st.isEmpty();
    }
}