import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OddandEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8};
		//Method 1
			System.out.println("Odd Numbers");
			for(int i:arr) {
				if(i%2!=0)
					System.out.print(i+" ");
			}
		System.out.println();
		System.out.println("Even Numbers");
		    for(int i:arr) {
		    	if(i%2==0)
		    		System.out.print(i+" ");
		    }
		    System.out.println();
		// Method 2    
		List<Integer>  odd =new ArrayList<>();
		List <Integer> even =new ArrayList<>();
		for(int i:arr) {
			if(i%2!=0)
				odd.add(i);
			else
				even.add(i);
		}
		Iterator itr1=odd.iterator();
		Iterator itr2=even.iterator();
		System.out.println("Odd Numbers");
		while(itr1.hasNext())
			System.out.print(itr1.next()+" ");
		System.out.println();
		System.out.println("Even Numbers");
		while(itr2.hasNext())
			System.out.print(itr2.next()+" ");
				

	}

}
