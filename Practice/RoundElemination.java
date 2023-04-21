import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;


public class RoundElemination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9, x = 3;
		Queue<Integer> queue= new LinkedList<>();
		int  count=0;
		for(int i=1;i<=n;i++)
			queue.add(i);
		while(queue.size()>=x) {
			int temp = queue.poll();
			if(++count ==x) {
				System.out.print(temp+" ");
				count=0;
				continue;
			}
			queue.add(temp);
		}
	}

}
