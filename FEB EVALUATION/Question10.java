import java.util.List;
import java.util.ArrayList;

public class Question10 {
	public static List<List<Integer>> findPairs(int[] arr,int k){
		List<List<Integer>> result = new ArrayList<>();
 		
		int left = 0,right = 1;
		while(left<arr.length-1) {
			int a = arr[left],b=arr[right];
			int sum = a+b;
			if(sum%5 == 0) {
				ArrayList<Integer> array = new ArrayList<>(2);
				array.add(a);
				array.add(b);
				result.add(array);
			}
			if(right == arr.length-1) {
				left++;
				right = left+1;
				continue;
			}
			right++;		
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int k = 5;
		List<List<Integer>> pairs= findPairs(arr,k);
		System.out.println(pairs);

	}

}
