import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class FrequencyOFElementsUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,3,9,9,3,4,1,2,2,5,6};
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
		System.out.println("Element | Frequency");
		System.out.println("--------------------");
		for(int key:keys) {
			System.out.println("   "+key + "        "+freq_arr.get(key) );;
		}
		

	}

}
