import java.util.Arrays;

public class RadixSort {
	private static void countSort(int[] arr,int n,int place) {
		int[] res = new int[n+1];
		int[] count = new int[10];
		for(int i=0;i<n;i++) {
			count[(arr[i]/place)%10]++;
		}
		for(int i=1;i<count.length;i++) {
			count[i]+=count[i-1];
		}
		for(int i=n-1;i>=0;i--) {
			res[count[(arr[i]/place)%10] -1]=arr[i];
			count[(arr[i]/place)%10]--;
		}
		for(int i=0;i<arr.length;i++) {
			arr[i] =res[i];
		}
	}
	private void radixSort(int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		for(int place =1;max/place>0;place*=10) {
			countSort(arr,arr.length,place);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {765,654,543,432,321};
		RadixSort sort = new RadixSort();
		sort.radixSort(arr);
		System.out.println(Arrays.toString(arr));
	
	}

}
