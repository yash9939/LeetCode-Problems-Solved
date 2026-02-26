class Solution {
    public int numSteps(String s) {
        int cnt = 0;
        while(!s.equals("1")){
            if(s.charAt(s.length()-1)=='1'){
                s = add(s);
                cnt++;
            }
            else{
                s = s.substring(0, s.length()-1);
                cnt++;
            }
        }

        return cnt;
    }

    public String add(String s){
        int carry = 1;
        String res = "";
        for(int i = s.length()-1; i>=0; i--){
            if(s.charAt(i)=='1' && carry==1){
                res = '0'+res;
            }
            else if((s.charAt(i)=='1' && carry == 0) || (s.charAt(i)=='0' && carry == 1)){
                res = '1'+res;
                carry = 0;
            }
            else{
                res = '0'+res;
            }
        }

        if(carry==1){
            res = '1'+res;
        }

        return res;
    }
}