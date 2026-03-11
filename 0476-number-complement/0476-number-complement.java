class Solution {
    public int findComplement(int num) {
        if(num==1){
            return 0;
        }

        String binary = toBinary(num);
        
        String revBinary = "";
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=='1'){
                revBinary+="0";
            }
            else{
                revBinary+="1";
            }
        }

        return toInt(revBinary);
    }

    public String toBinary(int n){
        String res = "";
        while(n>1){
            res = String.valueOf(n%2)+res;
            n = n/2;
        }

        res = "1"+res;
        return res;
    }

    public int toInt(String s){
        int res = 0;
        for(int i=0; i<s.length(); i++){
            res+=(Character.getNumericValue(s.charAt(i))*(int)(Math.pow(2, s.length()-i-1)));
        }

        return res;
    }
}