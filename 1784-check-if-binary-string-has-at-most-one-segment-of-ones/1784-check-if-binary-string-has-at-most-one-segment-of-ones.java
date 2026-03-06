class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()==1 && s.charAt(0)=='1'){
            return true;
        }

        int i = 0, j = 0;
        while(j<s.length()){
            if(s.charAt(j)=='1'){
                if(j-i>1){
                    return false;
                }
                i=j;
            }
            j++;
        }

        return true;
    }
}