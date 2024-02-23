class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
       int cost[] = new int[n];
       Arrays.fill(cost, Integer.MAX_VALUE);
       cost[src] = 0;
       int count = 0;
       int tempcost[] = cost.clone();
       while(count <= k)
       {
           tempcost = cost.clone();
           for(int[] flight : flights)
           {
               int s = flight[0];
               int d = flight[1];
               int c = flight[2];

               if(cost[s] != Integer.MAX_VALUE && (cost[s] + c ) < tempcost[d])
               {
                   tempcost[d] = cost[s] + c;
               }
           }
           cost = tempcost;
           count++;
       }
       if(cost[dst] == Integer.MAX_VALUE)
       {
           return -1;
       }
       return cost[dst];
    }
}