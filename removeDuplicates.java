public static int removeDuplicates(int[] nums){
        int mainCount=0,count =0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                continue;
            }
            while (count > 0) {
                shiftNumber(++mainCount, i, nums);
                count=0;
            }
        }
        if (count>0){
            shiftNumber(++mainCount,nums.length-1,nums);
        }
        return ++mainCount;
    }

    public static void shiftNumber(int count, int pos, int[] nums) {
        if (pos+1 < nums.length)
            nums[count] = nums[pos + 1];
        else
            nums[count] = nums[pos];
    }
