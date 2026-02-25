class Solution {
    public int longestConsecutive(int[] nums) {
        TreeMap<Integer, Integer> hm = new TreeMap<>();

        for(int i = 0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }

        int cnt = 0, curr = 0, prev = 0;
        for(int k: hm.keySet()){
            if(curr==0){
                curr++;
                prev = k;
            }
            else{
                if((prev+1)==k){
                    curr++;
                    prev = k;
                }
                else{
                    cnt = Math.max(cnt, curr);
                    curr = 1;
                    prev = k;
                }
            }
        }

        cnt = Math.max(cnt, curr);
        return cnt;
    }
}