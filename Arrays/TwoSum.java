// LeetCode 1 - Two Sum
// Difficulty: Easy

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum=target-nums[i];
            if(!mp.containsKey(sum)) {
                mp.put(nums[i],i);
            }else{
                return new int[]{mp.get(sum),i};
            }
        }
        return new int[]{-1,-1};

    }
}
