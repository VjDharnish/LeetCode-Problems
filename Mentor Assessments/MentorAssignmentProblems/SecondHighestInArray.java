import java.util.Arrays;
public class SecondHighestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,13,1,12,8,11,65};
		int n =arr.length;
		//Method 1
		int max=0,second_max=0;
		for(int i=0;i<n;i++) {
			if(max<arr[i]) { 
				second_max =max;
				max =arr[i];
			}
			else if(second_max<arr[i])
				second_max = arr[i];
			
		}
		System.out.println("Second Largest:"+second_max);
		
		//method 2
		Arrays.sort(arr);
		System.out.println("Second Largest:"+arr[n-2]);

	}

}