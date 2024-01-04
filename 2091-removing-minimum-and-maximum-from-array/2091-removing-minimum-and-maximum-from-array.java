class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1)
            return 1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minIndex = 0, maxIndex = 0;
        for(int i=0;i<nums.length; i++) {
            if(min>nums[i]) {
                min=nums[i];
                minIndex = i;
            }
            if(max<nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }
        return getNoOfDeletion(minIndex, maxIndex ,nums.length);
    }

    public int getNoOfDeletion(int minIndex, int maxIndex, int length) {
        int ans = Integer.MAX_VALUE;
        ans = Math.min(ans, Math.max(minIndex, maxIndex) + 1);
        ans = Math.min(ans, length - Math.min(minIndex, maxIndex));
        ans = Math.min(ans, length - minIndex + maxIndex + 1);
        return Math.min(ans, minIndex + 1 + length - maxIndex);
    }
}