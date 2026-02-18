class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = getBinary(n);

        for(int i = 1; i<binary.length(); i++){
            if(binary.charAt(i)=='0'){
                if(binary.charAt(i-1)!='1'){
                    return false;
                }
            }
            else{
                if(binary.charAt(i-1)!='0'){
                    return false;
                }
            }
        }
        
        return true;
    }

    public String getBinary(int n){
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