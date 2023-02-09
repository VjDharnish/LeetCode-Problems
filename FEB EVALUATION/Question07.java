import java.util.List;
import java.util.ArrayList;
public class Question07 {
	public static void subSet(int[] N,int start,List<Integer> arr,List<List<Integer>> subsets) {
		if(start == N.length) {
			subsets.add(new ArrayList(arr));
			return;
		}
			arr.add(N[start]);
			subSet(N,start+1,arr,subsets);
			arr.remove(arr.size()-1);
			subSet(N,start,arr,subsets);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] N = {1,2,3};
		List<List<Integer>> subsets = new ArrayList<>();
		List<Integer> arr = new ArrayList<>();
		subSet(N,0,arr,subsets);
		System.out.println(subsets);

	}

}
