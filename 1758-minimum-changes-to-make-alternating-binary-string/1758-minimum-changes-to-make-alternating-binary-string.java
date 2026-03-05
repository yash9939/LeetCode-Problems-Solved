class Solution {
    public int minOperations(String s) {
        if(s.length()==1){
            return 0;
        }

        String correct1 = "1";
        String correct2 = "0";

        for(int i=1; i<s.length(); i++){
            if(correct1.charAt(i-1)=='1'){
                correct1+="0";
            }
            if(correct2.charAt(i-1)=='1'){
                correct2+="0";
            }
            if(correct1.charAt(i-1)=='0'){
                correct1+="1";
            }
            if(correct2.charAt(i-1)=='0'){
                correct2+="1";
            }
        }

        int cnt1 =0, cnt2 = 0;
        for(int i = 0; i<s.length(); i++){
            if(correct1.charAt(i)!=s.charAt(i)){
                cnt1++;
            }
            if(correct2.charAt(i)!=s.charAt(i)){
                cnt2++;
            }
        }

        return Math.min(cnt1, cnt2);
    }
}