class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<HashMap<Integer,Integer>> distinctMap = new ArrayList<>();
        distinctMap.add(new HashMap<>());
        int i=0;
        boolean inserted = false;
        for (int n : nums) {
            inserted = false;
            for (int j = 0; j <= i; j++) {
                if (!distinctMap.get(j).containsKey(n)) {
                    distinctMap.get(j).put(n, 1);
                    inserted = true;
                    break;
                }
            }
            if (!inserted) {
                distinctMap.add(new HashMap<>());
                i++;
                distinctMap.get(i).put(n, 1);
            }
        }
        List<List<Integer>> result = new ArrayList<>(i+1);
        for (int j=0;j<=i;j++) {
            result.add(new ArrayList<>(distinctMap.get(j).keySet()));
        }
        return result;
    }
}