import java.util.Arrays;

public class CountingSort {
	private void countSort(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		int[] count =new int[max+1];
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]++;
		}
		int[] temp = new int[arr.length];
		for(int i=1;i<count.length;i++) {
			count[i] = count[i]+count[i-1];
		}
		for(int i=arr.length-1;i>=0;i--) {
			temp[count[arr[i]]-1] =arr[i];
			count[arr[i]]--;
		}
		for(int i =0;i<arr.length;i++) {
			arr[i] =temp[i];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {61,52,24,23,32,21};
		CountingSort sort = new CountingSort();
		sort.countSort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
