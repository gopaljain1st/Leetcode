class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            sum += n;
            count += map.getOrDefault(sum - goal, 0);
        }
        return count;
    }
}