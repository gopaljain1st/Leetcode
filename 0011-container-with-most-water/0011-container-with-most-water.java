class Solution {
    public int maxArea(int[] height) {
        int left=0, right= height.length-1, maxArea =0;
        while(left<right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(area, maxArea);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}