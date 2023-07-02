// BFSS
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))
            return 0;
       Queue<String> queue = new LinkedList<>();
       Set<String> visited =new HashSet<>();
       queue.add(beginWord);
       visited.add(beginWord);
       int level  =1;
       while(!queue.isEmpty()){
           int size =queue.size();
           for(int i =0;i<size;i++){
               String word = queue.poll();
               if(word.equals(endWord))
                    return level; 
               for(String w: wordList){
                   if(!visited.contains(w) && isMatch(w,word)){
                       visited.add(w);
                       queue.add(w);
                     
                   }
               }
           }
             level++;
       }
       return 0;


    }
    private static boolean isMatch(String word1,String word2){
        boolean flag = true;
        for(int i =0;i<word1.length();i++){
            if(word1.charAt(i)!=word2.charAt(i)){
                if(flag)
                    flag =false;
                else
                    return false;
            }
        }
        
        return true;
    }
}
