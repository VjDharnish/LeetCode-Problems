// You are given an array of integers stones where stones[i] is the weight of the ith stone.

// We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

// If x == y, both stones are destroyed, and
// If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
// At the end of the game, there is at most one stone left.

// Return the weight of the last remaining stone. If there are no stones left, return 0.


class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer o1,Integer o2){
                if(o1 < o2)
                    return 1;
    
                return -1;
            }
        });
        for(int i:stones)
            queue.add(i);
        while(queue.size()>1){
            int s1= queue.poll();
            int s2=queue.poll();
            if(s1==s2) continue;
            queue.add(s1-s2);
        }
        return (queue.size()==1)?queue.poll():0;
    }
}
