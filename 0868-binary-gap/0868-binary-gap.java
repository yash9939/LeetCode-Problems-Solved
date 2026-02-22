class Solution {
    public int binaryGap(int n) {
        String binary = Binary(n);
        
        int i = 0, j = 1, cnt = 0;
        while(j<binary.length()){
            if(binary.charAt(j)=='0'){
                j++;
            }
            else{
                cnt = (cnt>(j-i)) ? cnt : (j-i);
                i = j;
                j++;
            }
        }

        return cnt;
    }

    public String Binary(int n){
        String res = "";

        while(n>1){
            int rem = n%2;
            res = rem+res;
            n = n/2;
        }

        res = "1"+res;

        return res;
    }
}