// Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

// Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

// For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

class Solution {
    public boolean buddyStrings(String s, String goal) {
       int  n =s.length();
       if(n!=goal.length())
        return false;
       if(s.equals(goal)){
           int a[]  = new int[26];
           for(int i=0;i<n;i++){
               a[s.charAt(i)-'a']++;
               if(a[s.charAt(i)-'a']==2)return true;
           }
           return false;
       }
       int ind1= -1;
       int ind2 = -1;
       for(int i =0;i<n;i++){
           if(s.charAt(i)!=goal.charAt(i)){
               if(ind1==-1) ind1=i;
               else if(ind2==-1) ind2=i;
               else return false;
           }

       }
       if(ind2==-1)return false;
       return(s.charAt(ind1)==goal.charAt(ind2) && s.charAt(ind2)==goal.charAt(ind1) );

    }
}
