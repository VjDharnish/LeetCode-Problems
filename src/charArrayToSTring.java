import java.util.Arrays;

public class charArrayToSTring {

	static String toString(char []arr,int i) {
		if(i==arr.length)
			return "";
		else
			return ""+arr[i]+toString(arr,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'o','r','a','n','g','e'};
		//method 1
		String Word= new String(arr);
		System.out.println(Word);
		//Method 2
		String word="";
		for(char c:arr)
			word+=c;
		System.out.println(word);
		//Method 3
		int n=0;
		String WORD=toString(arr,n);
		System.out.println(WORD);
		//method 4
		String wrd= String.valueOf(arr);
		System.out.println(wrd);

	}

}
