
public class question04 {
	static int numberOfCoins(int sum ,int[] denominations) {
		int count =0;
		int n = denominations.length;
		for(int i= n-1;i>=0;i--) {
			if(sum>0 && sum> denominations[i]) {
				sum-=denominations[i];
				count++;
			}
			else {
				break;
			}
		}
		for(int i=0;i<n;i++) {
			if(sum<denominations[i]) {
				continue;
			}
			else if(sum==0) {
				break;
			}
			else if(sum<0) {
				return -1;
			}
			
			count+= sum/denominations[i];
			sum=sum%denominations[i];
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denominations = {2000,500,200,100,50,20,10,5,2,1};
		int sum = 250;
		int denomSum = numberOfCoins(sum,denominations);
		System.out.println(denomSum);
		
		
	}

}
