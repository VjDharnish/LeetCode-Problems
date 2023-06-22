import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr=Arrays.asList(1,2,3,4,5,7,1,2,3);
		List<Integer> distinctArr  =arr.stream().distinct().toList();
		System.out.println(distinctArr);
		///Athoer Wayy
		
		Set<Integer> set =arr.stream().collect(Collectors.toSet());
		System.out.println(set);
		List<Integer> list = arr.stream().collect(ArrayList::new,(listTemp,num)->{
			if(!listTemp.contains(num))
				listTemp.add(num);
		},ArrayList::addAll);
		System.out.println(list);

	}

}
