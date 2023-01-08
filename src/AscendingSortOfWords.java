import java.util.Arrays;
import java.util.Collections;

public class AscendingSortOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"mog","mat","boy","apple"};
		//method 1
		 Arrays.sort(arr); 
	    // method 2
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					String temp =arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(String word:arr)
			System.out.println(word);

	}

}
