import java.util.Scanner;
public class LargestNum {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int large=arr[0];
		for(int i=0;i<num;i++) {
			if(large<arr[i])
				large=arr[i];	
		}
		System.out.print("Largest Element in Array: "+large);
		sc.close();
	}
}
