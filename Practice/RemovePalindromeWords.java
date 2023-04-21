
public class RemovePalindromeWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Malayalam is My mother tongue";
		 str = str.toLowerCase();
		String result = "";
		while(str.length()!=0) {
			int idx = str.indexOf(" ");
			System.out.println(idx);
			int start = 0;
			int end  =(idx==-1)?str.length():idx;
			
			if(!isPalindrome(str,start,end-1)) {
				result+=str.substring(start,end)+" ";
			}
			if(idx==-1)
				break;
			str =str.substring(end+1,str.length());
		//	System.out.println(str);
			
		}
		System.out.println(result);

	}

	private static boolean isPalindrome(String s,int left,int right) {
		while(left<right) {
			if(s.charAt(right)!=s.charAt(left)) {
				return false;
			}
			left++;right--;
		}
		return true;
	}

}
