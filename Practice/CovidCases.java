import java.util.Arrays;
import java.util.Stack;

public class CovidCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cases=  {1273, 1274, 1275, 1271, 1269, 1272, 1276, 1273};
		int[] result = new int[cases.length];
		Arrays.fill(result, -1);
		Stack<Integer> stack =new Stack<>();
		for(int i =0;i<cases.length;i++) {
			while(!stack.isEmpty()&& cases[stack.peek()]>cases[i]) {
				int ind =stack.pop();
				result[ind] = i-ind;
			}
			stack.push(i);
		}
		System.out.println(Arrays.toString(result));

	}

}
