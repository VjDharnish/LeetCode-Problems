// Given an m x n board of characters and a list of strings words, return all words on the board.

// Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.


class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();
        boolean[] found = new boolean[words.length];
        for(int i =0;i<board.length;i++){
            for( int  j =0;j<board[0].length;j++){
                for(int k =0;k<words.length;k++){
                    if(!found[k] && board[i][j] == words[k].charAt(0) && search(words[k],0,board,i,j)){
                        result.add(words[k]);
                        found[k] = true;
                    }
                }
                if(result.size() == words.length)
                    return result;
            }
        }
        return result;
    }
    public static boolean search(String word,int idx,char[][] board,int i ,int j){
        if(idx == word.length()) return true;
        if(i<0 || i==board.length || j<0 || j==board[0].length || board[i][j]!=word.charAt(idx))
            return false;
        board[i][j]  = '.';
        boolean checked = search(word,idx+1,board,i-1,j) ||search(word,idx+1,board,i+1,j)||search(word,idx+1,board,i,j-1)||search(word,idx+1,board,i,j+1);
        board[i][j]=word.charAt(idx);
        return checked;
        

    }
}
