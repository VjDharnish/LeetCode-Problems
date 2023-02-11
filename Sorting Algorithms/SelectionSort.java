import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,2,4,6,1,3};
		for(int i =0;i<arr.length-1;i++) {
			int minimum = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<minimum)
					minimum =arr[j];
			}
			int temp = arr[i];
			arr[i] = minimum;
			minimum= temp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));

	}

}
