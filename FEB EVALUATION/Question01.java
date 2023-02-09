import java.util.Arrays;
import java.util.HashMap;

public class Question01 {
	public static int[] flavour(int[] cost,int m) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int[] result = {-1,-1};
		if(m<0)
			return result;
		for(int i =0 ;i<cost.length;i++) {
			if(map.containsKey(cost[i])) {
				result[0] = map.get(cost[i])+1;
				result[1] = i+1;
				break;
			}
			else if(m-cost[i] != cost[i]){
				int need = m-cost[i];
				map.put(need, i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m =6;
		int[] cost = {1,3,4,5,6};			
		System.out.println(Arrays.toString(flavour(cost,m)));
	}

}
