class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!((str1+str2).equals(str2+str1))){
            return "";
        }

        int l1 = str1.length();
        int l2 = str2.length();

        while(l2!=0){
            int temp = l2;
            l2 = l1%l2;
            l1 = temp;
        }

        return str2.substring(0, l1);
    }
}