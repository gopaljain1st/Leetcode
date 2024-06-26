class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>(); // It will store elements of nums1.
    ArrayList<Integer> list = new ArrayList<>(); // It will store common elements of nums1 and nums2.

        //declare i so that it can be used further. (saves space)
        int i; 
        
        //traverse the array nums1, store element in Key and store its frequency in Value.        
        for(i = 0; i < nums1.length; i++)
        {
            // If map doesn't contain nums1[i] initially, the default value 0+1.
            // If map contain nums1[i] then increase its freq by 1.
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }

        //traverse the array nums2 and check for common elements.
        for(i = 0; i < nums2.length; i++)
        {
            // We need to check two conditions:
            // 1. map should contain nums2[i] element.
            // 2. freq of nums2[i] element must be greater than 1.
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0)
            {                
                list.add(nums2[i]);                         // add it to arraylist.
                map.put(nums2[i], map.get(nums2[i])-1);     // decrease its freq in map.
            }
        }
        // create a new array of list size.
        int [] arr = new int[list.size()];

        
        // traverse the list and add elements in the array.
        for(i = 0; i < list.size(); i++)
        {
            arr[i] = list.get(i);
        }
        
        // finally, return the resultant array.
        return arr;
    }
}