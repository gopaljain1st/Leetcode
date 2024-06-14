class Solution {
    public int minIncrementForUnique(int[] nums) {
        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (int a : nums) count.put(a, count.getOrDefault(a, 0) + 1);
        int res = 0, need = 0;
        for (int x: count.keySet()) {
            int v = count.get(x);
            res += v * Math.max(need - x, 0) + v * (v - 1) / 2;
            need = Math.max(need, x) + v;
        }
        return res;
    }
}