import java.util.Arrays;
import java.util.Stack;

//You are given the head of a linked list with n nodes.
//For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.
//Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0.
//
//		Example: Input: head = [2,7,4,3,5]
//			Output: [7,0,5,5,0]


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
