import java.util.Stack;

public class PostfixEvaluation {

	public static void main(String[] args) {
		String s  ="138*+";
		char[] arr  = s.toCharArray();
		Stack<Integer> stack = new Stack<>();
		int i = 0;
		int  result;
		while(i<arr.length) {
			if(arr[i] >= 48 && arr[i] <= 57 ) {
				stack.push(Integer.parseInt(arr[i]+""));
			}
			else {
				int second   = stack.pop();
				int first   = stack.pop();
				result = evaluate(first,second,arr[i]);
				stack.push(result);
				
			}
			i++;
		}
		System.out.println(stack.peek());
		
	}

	private static int evaluate(int first, int second, char c) {
		switch(c) {
		case '+':
			return first +second;
		case '-':
			return first -second;
		case '*':
			return first *second;
		case '/':
			return first /second;
		}
		return 0;
	}

}
