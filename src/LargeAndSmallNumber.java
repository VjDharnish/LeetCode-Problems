import java.util.Arrays;

public class LargeAndSmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,4,3,11,34,23,7};
		//Method 1
		int largest=arr[0],smallest=arr[0];
		for(int i =1;i<arr.length;i++) {
			if(largest < arr[i])
				largest =arr[i];
			if(smallest > arr[i])
				smallest =arr[i];
		}
		System.out.println("Largest Element:"+largest);
		System.out.println("Smallest Number:"+smallest);	
		
		//Method 2
		Arrays.sort(arr);
		System.out.println("Largest Element:"+arr[arr.length-1]);
		System.out.println("Smallest Number:"+arr[0]);

	}

}
