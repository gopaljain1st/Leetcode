class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n];
        int i=0,j=0,k=0;
        while (i<m && j<n){
            while(i<m && nums1[i] <= nums2[j]){
                nums[k++] = nums1[i++];
            }
            while(j<n && nums2[j] <= nums1[i]){
                nums[k++] = nums2[j++];
            }
        }
        while(i<m){
                nums[k++] = nums1[i++];
            }
        while(j<n){
            nums[k++] = nums2[j++];
        }
        System.arraycopy(nums,0,nums1,0,n+m);
    }
}