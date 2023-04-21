
public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find Duplicate from 1 to N
		int n = 5;
		int[] arr = {1,2,3,3,4,5};
		int sumOfNumbers  = n*(n+1)/2;
		int sum =0;
		for(int i : arr) {
			sum+=i;
		}
		int duplicate  = sum -sumOfNumbers;
		System.out.println(duplicate);

	}

}
