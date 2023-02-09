
import java.util.List;
import java.util.ArrayList;
public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		 String s1= "0 ab";
		 String s2= "6 bc";
		 String s3= "0 ef";
		 String s4= "6 gh";
		 String s5= "4 ij";
		 String[] str = {"0 ab","6 bc","0 ef","6 gh","4 ij"};
		 List<List> result = new ArrayList<>();
		 for(int i =0;i<n;i++) {
			 List<String>arr  = new ArrayList<>();
			 int idx = str[i].indexOf(" ");
			 if(i<n/2) {
				 arr.add(str[i].substring(0,idx));
				 arr.add("-");
			 }
			 else {
				 arr.add(str[i].substring(0,idx));
				 arr.add(str[i].substring(idx+1));
			 }
			 result.add(arr);
		 }
		 for(int i =0;i<result.size()-1;i++) {
			 for(int j =i+1;j<result.size();j++) {
				 if(Integer.parseInt((String) result.get(i).get(0))>Integer.parseInt((String) result.get(j).get(0))) {
					 ArrayList<String> temp = new ArrayList(result.get(i));
					 result.set(i, result.get(j));
					 result.set(j, temp);
					 
				 }
			 }
		 }
		 String newString = "";
		 for(int i=0;i<str.length;i++) {
			 newString+= result.get(i).get(1)+" ";
		 }
		 System.out.println(newString);

	}

}
