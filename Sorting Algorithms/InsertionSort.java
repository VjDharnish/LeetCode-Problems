import java.util.Arrays;
public class InsertionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr ={5,2,4,6,1,3};
		int sortedIndex = 1;
		for(int i=sortedIndex;i<arr.length;i++) {
			for(int j = i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;	
				}
			}			
		}	
		System.out.println(Arrays.toString(arr));
	}

}
