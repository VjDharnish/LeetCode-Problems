import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

class Trie {
	Trie[] arr ;
	boolean wordEnd;

	Trie() {
		arr=new Trie[26];
		wordEnd =false;
	}

	public String toString() {
		return Arrays.toString(arr);

	}
}

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		
		
		
		
		// TODO Auto-generated method stub
		String[] arr = { "fwer", "fwlow", "fwlght" };
		Trie root = new Trie();
		Trie child = root;

		char[] str = arr[0].toCharArray();
		int index = str.length - 1;
		for (int j = 0; j < str.length; j++) {
			child.arr[str[j] - 'a'] = new Trie();
			child = child.arr[str[j] - 'a'];
		}

		child.wordEnd = true;
		Trie node = root;
		
		for (int i = 1; i < arr.length; i++) {
			char[] str1 = arr[i].toCharArray();
			index = (index>str1.length-1)?str1.length-1:index;
			
			for (int j = 0; j <= index; j++) {

				if (node.arr[str1[j] - 'a'] == null) {
					
					index = j-1;
					
					break;
				}
				
				node  = node.arr[str1[j]-'a'];

			}
			node=root;


		}
		System.out.println(arr[0].substring(0, index +1));

	}

}
