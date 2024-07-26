class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        boolean[] visited = new boolean[V];
        int prov = 0;
        
        for (int i = 0; i<V; i++) {
            if (!visited[i]) {
                dfs(adj, visited, i);
                prov++;
            }
        }
        
        return prov;
    }
  
    private static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int curr) {
        visited[curr] = true;
         for(int i=0;i<adj.get(curr).size();i++){
             if(adj.get(curr).get(i)==1 && !visited[i])dfs(adj,visited,i);
         }
    }
  
};
