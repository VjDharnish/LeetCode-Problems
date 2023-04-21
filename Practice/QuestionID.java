import java.util.Stack;

public class QuestionID {

	public static void main(String[] args) {
		String str= "IIII";
		int count  =0;
		Stack<Integer>  stack = new Stack<>();
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i) == 'D') {
				stack.push(++count);
			}
			else {
				System.out.print(++count+" ");
				while(!stack.isEmpty()) {
					System.out.print(stack.pop()+" ");
				}
				
			}
		}
		System.out.print(++count+" ");
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
		
	}

}
