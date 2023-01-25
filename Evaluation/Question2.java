import java.util.ArrayList;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,1,5};
		int n = input.length;
		int m = input.length;
		int sum =0;
		List<List<Integer>> res= new ArrayList<>();
		
		for(int i:input) {
			sum+=i;
		}
		
		outer:while(m>1) {
			if(sum%m !=0) {
				m--;continue;
			}
			
			List<Integer> arr = new ArrayList<>();
			int newSum = sum/m;
			int temp = 0;
			for(int i =0;i<n;i++) {
				if(newSum > temp+input[i]) {
					temp+=input[i];
					arr.add(input[i]);
				}
				else if(newSum== temp+input[i]) {
					temp=0;
					arr.add(input[i]);
					res.add(new ArrayList<>(arr));
					arr.clear();
				}
				else if(newSum<temp+input[i]) {
					res.clear();
					arr.clear();
					m--;
					break;
				}
				if(i==n-1) {
					break outer;
				}
			}
			
		}
		
		System.out.println(res);

	}

}
