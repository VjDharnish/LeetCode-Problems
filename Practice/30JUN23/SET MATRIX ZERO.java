class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<int[]> set = new HashSet<>();
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0)
                    set.add(new int[]{i,j});
            }
        }
        for(int [] a:set){
            for(int i =0;i<matrix[0].length;i++){
                matrix[a[0]][i]=0;
            }
            for(int i =0;i<matrix.length;i++){
                matrix[i][a[1]]=0;
            }
        }
    }
}
