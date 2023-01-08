import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,4,3,2,1,2,4,5,3,6};
		int n=arr.length;
		Map<Integer,Integer> freq_arr= new HashMap<>();
		for(int i=0;i<n;i++) {
			if(freq_arr.containsKey(arr[i])) {
				freq_arr.put(arr[i],freq_arr.get(arr[i])+1);
			}
			else {
				freq_arr.put(arr[i], 1);
			}
		}
		Set<Integer> keys = freq_arr.keySet();
		for(int key:keys) {
			if(freq_arr.get(key)>1)
				System.out.println(key);
		}
		
	
	}

}
