import java.util.Stack;

public class QuestionIDVersion2 {

	public static void main(String[] args) {
		String str ="IIDDIDID";
		Stack<Integer> stack  = new Stack<>();
		for(int i=0;i<=str.length();i++) {
			if(i==str.length()||str.charAt(i) == 'I') {
				stack.push(i+1);
				while(! stack.isEmpty()) {
				System.out.print(stack.pop()+" ");
				}
			}
			else {
				stack.push(i+1);
			}
		}
	}

}
