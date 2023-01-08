
public class SortOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= { 1,2,3,4,5,6,7,8,9};
		int n=arr.length;
		for(int i=0;i<n-2;i+=2) {
			for(int j=i+2;j<n;j+=2) {
				if(arr[i]<arr[j]) {
					int temp =arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
	    for(int i=1;i<n-1;i+=2) {
	    	for(int j=i+2;j<n;j+=2) {
	    		if(arr[i]>arr[j]) {
	    			int temp =arr[i];
	    			arr[i]=arr[j];
	    			arr[j]=temp;
	    		}
	    		
	    	}
	    }
	    for(int num:arr)
	    	System.out.print(num+" ");

	}

}
