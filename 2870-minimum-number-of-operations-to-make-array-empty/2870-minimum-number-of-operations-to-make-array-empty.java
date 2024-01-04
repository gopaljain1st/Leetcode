class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int n : nums) {
            frequency.computeIfPresent(n, (integer, integer2) -> integer2+1 );
            frequency.putIfAbsent(n, 1);
        }
        int count = 0;
        for (int n : new ArrayList<>(frequency.values())) {
            if (n==1)
                return -1;
            count+= (int) Math.ceil(n/3.0);
        }
        return count;
    }
} 