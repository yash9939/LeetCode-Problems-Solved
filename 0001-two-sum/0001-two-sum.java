class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0 ;i<nums.length; i++){
            hm.put(i, target-nums[i]);
        }

        int a = -1, b = -1;
        for(int i: hm.keySet()){
            if(hm.containsValue(nums[i])){
                if(a!=-1 && b!=-1){
                    if(Math.abs(nums[a])+Math.abs(nums[b])==Math.abs(target)){
                        break;
                    }
                    else if(Math.abs(nums[a])+Math.abs(nums[i])==Math.abs(target)){
                        b = i;
                        break;
                    }
                    else{
                        a = b;
                        b = i;
                        break;
                    }
                }
                if(a==-1){
                    a = i;
                }
                else{
                    b = i;
                }
            }
        }

        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}