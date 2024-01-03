class Solution {
    public int numberOfBeams(String[] bank) {
       int firstMachine = 0, result=0;
        for (String s : bank) {
            int count = 0;
            for (char c : s.toCharArray()){
                if (c=='1')
                    count++;
            }
            if (count > 0) {
                if (firstMachine > 0) {
                    result += firstMachine * count;
                }
                firstMachine = count;
            }
        }
        return result;
    }
}