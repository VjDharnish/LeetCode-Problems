class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        List<int[]> list =new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int currentX = intervals[0][0];
        int currentY = intervals[0][1];
        list.add(new int[]{currentX,currentY});
        for(int i =1;i<intervals.length;i++){
            int tempX = intervals[i][0];
            int tempY = intervals[i][1];
            if(currentY>=tempX ){
                currentX =Math.min(currentX,tempX);
                currentY = Math.max(currentY,tempY);
                  list.remove(list.size()-1);
            }
            else{
                currentX=tempX;
                currentY =tempY;
              

            }
            list.add(new int[]{currentX,currentY});
        }
        int[][] merged =new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            merged[i] = list.get(i);
        }
        return merged;
    }
}
