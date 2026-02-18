class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int j = 0;

        for(int i=0; i<nums.length; i++){
            int idx = (nums[i]==-((nums.length)-2)) ? 0 : Math.abs(nums[i]);
            if(nums[idx]<0){
                ans[j] = idx;
                j++;
                if(j>=2){
                    break;
                }
            }
            else{
                if(nums[idx]==0){
                    nums[idx] = -((nums.length)-2);
                }
                else{
                    nums[idx]*=-1;
                }
            }
        }

        return ans;
    }
}