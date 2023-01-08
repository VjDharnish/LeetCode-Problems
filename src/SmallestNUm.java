import java.util.Scanner;
public class SmallestNUm {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elements:");
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int small=arr[0];
		for(int i=0;i<num;i++) {
			if(small>arr[i])
				small=arr[i];	
		}
		System.out.print("Smallest Elements in Array: "+small);
		sc.close();
	}
}
