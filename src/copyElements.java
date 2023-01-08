
public class copyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4};
		int arr2[]=new int[arr1.length];
		int i=0;
		for(int num:arr1)
			arr2[i++] = num;
		for(int num:arr2)
			System.out.print(num+" ");
	}
}
