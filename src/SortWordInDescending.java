
public class SortWordInDescending {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String word="hello world";
		String res="";
		char[] arr= word.toCharArray();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					char temp = arr[i];
					arr[i]=arr[j];
					arr[j] =temp;
				}
			}
		}
		for(char c:arr)
			res+=c;
		System.out.println(res);
	}

}
