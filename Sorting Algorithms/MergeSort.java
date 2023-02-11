import java.util.Arrays;

public class MergeSort {
	private static void mergeSort(int[] arr,int l,int r) {
		
		if(l<r) {
		int mid  = (l+r)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		merge(arr,l,r,mid);	
		}
		
	}
	private static void merge(int[] arr,int l, int r,int mid) {
		// TODO Auto-generated method stub
		int[] left = new int[mid-l+1];
		int[] right = new int[r-mid];
		for(int i =0;i<mid-l+1;i++) {
			left[i] = arr[l+i];
		}
		for(int i=0;i<r-mid;i++) {
			right[i] = arr[mid+1+i];
		}
		int k =l;
		int ptr1 =0,ptr2= 0;
		while(ptr1<left.length && ptr2<right.length) {
			if(left[ptr1]>right[ptr2]) {
				arr[k++] = right[ptr2++];
			}
			else {
				arr[k++] = left[ptr1++];
			}	
			
		}
		while(ptr2<right.length) {
			arr[k++] = right[ptr2++];
			
		}
		
		while(ptr1<left.length) {
			arr[k++] = left[ptr1++];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,5,4,3,2,1};// 1,2,3,4,5,6
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
