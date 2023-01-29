import java.util.HashMap;
import java.util.Map;


public class DuplicateCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world";
		HashMap<Character,Integer> map = new HashMap<>();
		for(int  i=0;i< s.length();i++) {
			 map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			
		}
		//System.out.println(map);
		for(Map.Entry<Character,Integer> entry :map.entrySet()) {
			
			if(entry.getValue()>=2)System.out.println(entry.getKey());
		}

	}

}
