import java.util.Arrays;
import java.util.List;

public class CheckAllPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=Arrays.asList(1,2,3,4,-5,7);
		boolean isAllPositive=arr.stream().allMatch((a)->a>0);
		System.out.println(isAllPositive?"All are Positive":"Not all are postive");;

	}

}
