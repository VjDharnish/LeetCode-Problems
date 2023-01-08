
public class AlternateSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int n = arr.length;
		int min_index=0,max_index=n-1;
		int max = arr[max_index] +1;
		for(int i=0;i<n;i++) {
			if(i%2 == 0) {
				arr[i]+=(arr[max_index]%max)*max;
				max_index--;
			}
			else {
				arr[i]+=(arr[min_index]%max)*max;
				min_index++;
			}
		}
		for(int i=0;i<n;i++) {
			arr[i]/=max;
		}
		for(int i:arr) {
			System.out.print(i +" ");
		}
		

}
}