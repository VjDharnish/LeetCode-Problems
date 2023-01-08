
public class SumOfArrayElementsMethod2 {
	public static int Sum(int[] arr,int low,int high) {
		int mid =(low+high)/2;
		while(low<high) {
			return Sum(arr,low,mid)+Sum(arr,mid+1,high);
		}
		return arr[mid];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,6,2,4,3,5,1};
		int low=0,high=arr.length-1;
		int result=  Sum(arr,low,high);
		System.out.println(result);
		

	}

}
