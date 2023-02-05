import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class FindAllAnagram {
	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> arr = new ArrayList<>();
       if(s.length()<p.length())
           return arr;
       int[] map1 = new int[26];
       int[] map2 = new int[26];
      
       int size = p.length();
       for(int i=0;i<size;i++){
           map1[p.charAt(i)-'a']++;
           map2[s.charAt(i)-'a']++;
       }
       
       for(int i =size;i<s.length();i++){
            if(Arrays.equals(map1,map2)){
               arr.add(i-size);
           }
           map2[s.charAt(i-size)-'a']--;
           map2[s.charAt(i)-'a']++;
          
       }
        if(Arrays.equals(map1,map2)){
               arr.add(s.length()-size);
           }
       return arr;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd";
		String p ="abc";
		System.out.println(findAnagrams(s,p));

	}

}
