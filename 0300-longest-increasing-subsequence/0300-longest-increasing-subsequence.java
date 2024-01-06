class Solution {
    public int lengthOfLIS(int[] nums) {
        int [] count = new int[nums.length];
        int max = 1;
        for(int i=0;i<nums.length;i++)
            count[i] = 1;
        for(int i=1;i<nums.length;i++) {
            for(int j=0; j<i;j++) {
                if(nums[i]>nums[j] && count[j]+1 > count[i]) {
                    count[i] = count[j] + 1;
                    max = Math.max(count[i], max);
                }
            }
        }
        return max;
    }
}