// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].
  
import java.util.Arrays;
public class ShuffleTheArray {
	public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int k=0;
        for(int i=0;i<n;i++){
            res[k]= nums[i];
            res[k+1] = nums[i+n];
            k+=2;
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6};
		int n =3;
		int[] res = shuffle(nums,n);
		System.out.println(Arrays.toString(res));

	}
}
