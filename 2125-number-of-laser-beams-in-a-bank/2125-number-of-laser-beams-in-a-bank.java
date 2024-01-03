class Solution {
    public int numberOfBeams(String[] bank) {
       int firstMachine = 0, result=0;
        for (String s : bank) {
            long count = s.chars().filter(ch -> ch =='1').count();
            if (count > 0) {
                if (firstMachine > 0) {
                    result += (int) (firstMachine * count);
                }
                firstMachine = (int) count;
            }
        }
        return result;
    }
}