class Solution {
    public int numberOfBeams(String[] bank) {
       int firstMachine = 0, result=0;
        for (String s : bank) {
            int count = s.length() - s.replaceAll("1", "").length();
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