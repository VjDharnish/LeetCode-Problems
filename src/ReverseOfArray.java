
public class ReverseOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		int n=arr.length;
		//Method 1
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Method 2
		for(int i=0;i<n;i++) {
			System.out.print(+arr[n-1-i]+" ");
		}
	}

}
