import java.util.Arrays;
import java.util.List;


public class DoubleEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=Arrays.asList(1,2,3,4,5,7);
		int doubledEvenSum = arr.stream().filter(n->n%2==0).map(n->n*2).reduce(0,(a,b)->a+b);
		System.out.println(doubledEvenSum);
	}

}
