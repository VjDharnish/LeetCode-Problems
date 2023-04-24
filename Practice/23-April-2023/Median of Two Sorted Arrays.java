

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//The overall run time complexity should be O(log (m+n)).
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2. Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//		The overall run time complexity should be O(log (m+n)).
//
//		Input: nums1 = [1,3], nums2 = [2]
//		Output: 2.00000
//		Explanation: merged array = [1,2,3] and median is 2.

public class MedianOf2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {1,3};
		int[] nums2= {2};
		int total = nums1.length+nums2.length;
		int ptr1= 0,ptr2=0;
		int[] result =new int[total];
		int k =0;
		while(ptr1<nums1.length || ptr2<nums2.length) {
			if(nums1[ptr1]<nums2[ptr2]) {
				result[k++] = nums1[ptr1++];	
			}
			else {
				result[k++] = nums2[ptr2++];	
			}
			
		}
		while(ptr1<nums1.length)
			result[k++] = nums1[ptr1++];
		while(ptr2<nums2.length)
			result[k++] = nums2[ptr2++];
		int  mid  = total/2;
		if(total%2==0) {
			
			System.out.println((result[mid]+result[mid+1])/2.0);
		}
		System.out.println((double)result[mid]);
		
				

	}

}
