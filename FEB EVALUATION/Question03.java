import java.util.Arrays;
public class Question03 {
	public static int medianX2(int[] expenditure,int d,int i) {
		if(d%2!=0) {
			return expenditure[(i+d)/2];
		}
		else {		
			float med = (expenditure[(i+d)/2]+expenditure[(i+d)/2+1])/2;
			return (int) med;
		}
	}
	public static int warnings(int[] expenditure,int d) {
		int i=0;
		int count=0;
		while(i+d<expenditure.length) {
			Arrays.sort(expenditure,i,d+i);
			int median = medianX2(expenditure,d,i);
			if(expenditure[i+d]>= median*2) {
				count++;
			}
			i++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int expenditureSize = 9;
		int d =4;	
		int[] expenditure = {1,2,3,4,4};		
		System.out.println(warnings(expenditure,d));

	}

}
