
public class PrintOddEvenPostionElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int n=arr.length;
		System.out.println("Odd Position Elements");
		for(int i=0;i<n;i+=2)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println("Even Position Elements");
		for(int i=1;i<n;i+=2)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		
		//Method 2
		System.out.println("Odd Position Elements");
		for(int i=0;i<n;i++) {
			if(i%2 ==0)
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Even Position Elements");
		for(int i=1;i<n;i++) {
			if(i%2!=0)
			System.out.print(arr[i]+" ");
		}
		

	}

}
