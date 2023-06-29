// 1514. Path with Maximum Probability
// Input: n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], start = 0, end = 2
// Output: 0.25000
// You are given an undirected weighted graph of n nodes (0-indexed), represented by an edge list where edges[i] = [a, b] is an undirected edge connecting the nodes a and b with a probability of success of traversing that edge succProb[i].

// Given two nodes start and end, find the path with the maximum probability of success to go from start to end and return its success probability.

// If there is no path from start to end, return 0. Your answer will be accepted if it differs from the correct answer by at most 1e-5.
class Solution {
    class Pair<K,V>{
        private K key;
        private V value;
        public Pair(K key,V value){
            this.key=key;
            this.value=value;
        }
        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }

    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair<Integer,Double>>> adj = new ArrayList<>();
        for(int  i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i =0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new Pair<Integer,Double>(edges[i][1],succProb[i]));
            adj.get(edges[i][1]).add(new Pair<Integer,Double>(edges[i][0],succProb[i]));
        }
        double[] dist = new double[n];
        Arrays.fill(dist,0.0);

       Queue<Integer> queue = new LinkedList<>();
       queue.offer(start);
       dist[start]=1.0;

       while(!queue.isEmpty()){
           int node = queue.poll();
           for(Pair<Integer,Double> pair :adj.get(node)){
               int dest = pair.getKey();
               double prob = dist[node]*pair.getValue();
               if(prob>dist[dest]){
                   dist[dest]= prob;
                   queue.add(dest);
               }
           }
       }
       return dist[end];

    }
}
