import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElements {
	static List<Integer> removeDup(int arr[]) {
		int n=arr.length;
		List<Integer> list= new LinkedList<>();
		for(int i:arr) {
			list.add(i);
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(list.get(i)==list.get(j)) {
					list.remove(j);
					n--;
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,1,2,3,4,5,5,6,7,7,8};
		//Method 1
		System.out.println("Using Set");
		Set<Integer> uniq_arr= new HashSet<>();
		for(int i:arr) {
			uniq_arr.add(i);
		}
		for(int i:uniq_arr)
			System.out.print(i+" ");
		System.out.println();
		//Method 2
		System.out.println("Using LinkedList");
		List<Integer> result =removeDup(arr); 
		Iterator<Integer> itr= result.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}
}
