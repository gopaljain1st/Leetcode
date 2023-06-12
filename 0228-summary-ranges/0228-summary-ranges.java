class Solution {
   public static List<String> summaryRanges(int[] nums) {
        if(nums==null || nums.length==0)
            return new ArrayList<>(0);
        if(nums.length == 1){
            return Collections.singletonList(String.valueOf(nums[0]));
        }
        List<String> answer = new ArrayList<>();
        int end = nums[0],start = nums[0];
        for(int i=1;i<nums.length;i++){
            if(end+1 == nums[i]) {
                end = nums[i];
                continue;
            }
            answer.add(start == nums[i-1] ? String.valueOf(start) : start+"->"+end);
            start = end = nums[i];
        }
        answer.add(start == nums[nums.length-1] ? String.valueOf(start) : start+"->"+nums[nums.length-1]);
        return answer;
    }
}