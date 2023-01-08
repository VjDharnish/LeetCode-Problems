import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,20,13,1,12,8,11,65,4,3};
		int n =arr.length;
		//Method 1
		int min=arr[0],second_min=arr[0];
		for(int i=1;i<n;i++) {
			if(min>arr[i]) { 
				second_min =min;
				min =arr[i];
			}
			else if(second_min>arr[i])
				second_min = arr[i];
			
		}
		System.out.println("Second Smallest:"+second_min);
		
		//method 2
		Arrays.sort(arr);
		System.out.println("Second Smallest:"+arr[1]);

	}

}
