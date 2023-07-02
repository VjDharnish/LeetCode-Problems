// A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:

// Every adjacent pair of words differs by a single letter.
// Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
// sk == endWord
// Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.
// Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
// Output: 5
// Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.4
//TLE

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))
            return 0;
        boolean[] visited = new boolean[wordList.size()];
        int min =5001;
        int res= recurse(beginWord,endWord,min,1,visited,wordList);
        return (res==5001)?0:res;
    }
    public static int recurse(String begin,String endWord,int min,int count,boolean[] visited,List<String>wordList){
        if(begin.equals(endWord)){
            System.out.println(count);
            return count;
        }
            
        for(int i =0;i<wordList.size();i++){
            if(!visited[i] && isMatch(begin,wordList.get(i))){
                visited[i]=true;
            //   System.out.println(i);
                min =Math.min(min,recurse(wordList.get(i),endWord,min,count+1,visited,wordList));
               visited[i]=false;
            }
             
        }
       
        return min;
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
