import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagram {
	//Method 1
	static boolean isAnagram(String str1,String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
	    Arrays.sort(arr1);
	    Arrays.sort(arr2);
	    for(int i=0;i<arr1.length;i++) {
	    	if(arr1[i] != arr2[i])
	    		return false;
	    }
	    return true;
		
					
	}
	//Method 2
	
	static boolean checkAnagram(String str1,String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str1.length();i++) {
			if(map.containsKey(str1.charAt(i))) {
				map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
			}
			else {
				map.put(str1.charAt(i),1);
			}
		}
		for(int i=0;i<str2.length();i++) {
			if(map.containsKey(str2.charAt(i))) {
				map.put(str2.charAt(i),map.get(str2.charAt(i))-1);
			}
			else
				return false;
		}
		Set<Character> keys = map.keySet();
		for(char key:keys) {
			if(map.get(key)!=0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="basscde";
		String str2 = "sbesdca";
		boolean result = isAnagram(str1,str2);
		System.out.println(result);
		boolean result2 = checkAnagram(str1,str2);
		System.out.println(result2);

	}

}
