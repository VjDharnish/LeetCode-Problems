import java.util.Arrays;

public class SortArrayInAscending {
    public static int[] Sort(int[] arr1) {
    	int n =arr1.length;
    	for(int i=0;i<n-1;i++) {
    		for(int j=i+1;j<n;j++) {
    			if(arr1[i] >arr1[j]) {
    				int temp =arr1[i];
    				arr1[i]=arr1[j];
    				arr1[j]=temp;
    			}
    		}
    	}
    	return arr1;
    }
  
    	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,5,4,6,3,8,1};
		//Method 1
		int sorted_arr[] = Sort(arr);
		System.out.println(Arrays.toString(sorted_arr));
		//Method 2
		int arr2[]= {10,6,7,8,4};
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));

		

	}

}
