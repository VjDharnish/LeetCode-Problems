import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
public class IterateHashMapusingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> map= new HashMap<>();
		map.put(1, 1);
		map.put(2,2);
		Set<Integer> keys = map.keySet();
		for(int key:keys) {
			System.out.println(key+" "+map.get(key));
		}
		Iterator <Map.Entry<Integer,Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
