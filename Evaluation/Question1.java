import java.util.Stack;

public class Question1 {
	private static boolean isOperator(char ch) {
		switch(ch) {
		case '+':
		case '-':
		case '*':
		case '/':
		case '%':
			return true;
		default:
			return false;
		}
	}
	private static boolean isVariable(char ch) {
		return (ch>= 'a' && ch<='z'|| ch>='A' &&ch >='Z');
	}
	
	static boolean validExp(String input) {
		if(isOperator(input.charAt(0)) || isOperator(input.charAt(input.length()-1))){
				return false;
		}
	//	if(input.charAt(0)==')' || input.charAt(input.length()-1)=='(')
	//		return false;
		Stack <Character> stack = new Stack<>();
		int i=0;
		while(i<input.length()) {
			char c = input.charAt(i);
			if(c=='(') {
				stack.add(c);
			}
			else if(c==')') {
				if(stack.isEmpty()|| isOperator(input.charAt(i-1)))
					return false;
				stack.pop();
			}
			else if(isOperator(c)) {
				if(isOperator(input.charAt(i-1))|| input.charAt(i-1) == '(')
					return false;			
			}
			else if(isVariable(c)) {
				if(isVariable(input.charAt(i-1)))
					return false;
			}
			i++;
			
		}
		if(stack.isEmpty()) return true;
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= "(a+b+a*b)";
		boolean valid = validExp(input);
		System.out.println(valid?"valid":"Invalid");

	}

}
