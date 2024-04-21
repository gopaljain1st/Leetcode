class Solution {
   public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> vtces = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            vtces.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];

            vtces.get(x).add(y);
            vtces.get(y).add(x);
        }
        boolean[]visited=new boolean[n];
        boolean b= helper(edges,source,destination,vtces,visited);
      return b;
    }
    public boolean helper(int[][] edges, int source, int destination,ArrayList<ArrayList<Integer>> vtces,boolean[]visited){

        if(source==destination){
            return true;
        }
        visited[source]=true;
        for (int l:vtces.get(source)){
                if (!visited[l]){
                   boolean b= helper(edges, l , destination,vtces, visited);
                   if(b){
                       return true;
                   }
                }
            }
        return false;
    }
}