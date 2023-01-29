
public class CheckPrime {
	static boolean checkPrime(int n) {
		if(n<=1)return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) return false;
		}
		return true;
					
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		System.out.println(checkPrime(n));

	}

}
