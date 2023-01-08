
public class PrintAllTheCharInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'b','a','n','a','n','a'};
		//Method 1
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println();
		//Method 2
		for(char c:arr) {
			System.out.println(c);
		}

	}

}
