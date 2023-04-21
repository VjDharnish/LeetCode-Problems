import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABBC";
		char[]arr = str.toCharArray();
		Arrays.sort(arr);
		List<String> result =new ArrayList<>();
		boolean[] bool = new boolean[arr.length];
		permute(arr,new StringBuilder(), 0,result,bool);
		System.out.println(result);

	}

	private static void permute(char[] arr, StringBuilder sb,int i, List<String> result,boolean[] bool) {
		if(i==arr.length) {
			String s = sb.toString();
			if(!result.contains(s))
				result.add(s);
			return;
		}
		for(int j=0;j<arr.length;j++) {
			if(bool[j]) continue;
			bool[j]= true;
			sb.append(arr[j]);
			permute(arr,sb,i+1,result,bool);
			bool[j]=false;
			sb.setLength(sb.length()-1);
		}
		
	}

}
