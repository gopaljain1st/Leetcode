class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> counts = new HashMap<>(tasks.length);
        for(int i=0;i<tasks.length;i++){
            if (counts.containsKey(tasks[i])){
                counts.put(tasks[i],counts.get(tasks[i])+1);
            } else {
                counts.put(tasks[i],1);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> it = counts.entrySet().iterator();
        int totalCount =0;
        while (it.hasNext()){
            Map.Entry<Integer, Integer> entry = it.next();
            if (entry.getValue() == 1){
                return -1;
            }
            if (entry.getValue()%3==0){
                totalCount+=entry.getValue()/3;
            } else {
                totalCount+=entry.getValue()/3+1;
            }
        }
        return totalCount;
    }
}
