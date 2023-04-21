
public class PrintUsingVarags {
	private void print(String...str) {
		
		for(String s:str) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintUsingVarags obj = new PrintUsingVarags();
		obj.print("hello");
		obj.print("hello","world");
	}

}
