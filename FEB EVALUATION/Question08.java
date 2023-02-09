import java.util.Arrays;

public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,5,1,6};
		int sortedIndex = 1;
		for(int i =sortedIndex;i<arr.length;i++) {
			for(int j =i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					arr[j]  =  arr[j]+arr[j-1];
					arr[j-1] = arr[j]-arr[j-1];
					arr[j] = arr[j]-arr[j-1];
				}
			}
			sortedIndex++;
		}
		System.out.println(Arrays.toString(arr));

	}

}
