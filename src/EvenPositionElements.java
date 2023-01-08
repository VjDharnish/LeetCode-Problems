import java.util.Scanner;
public class EvenPositionElements {
     public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number of elements:");
		int num=sc.nextInt();		
		int arr[]=new int[num];
			for(int i=0;i<num;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.print("Elements in even position: ");
			for(int i=0;i<num;i++)
				if(i%2!=0)
					System.out.print(arr[i]+" ");
			sc.close();


	}

}
