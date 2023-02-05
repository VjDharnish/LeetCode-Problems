public class Pow {
	public static double myPow(double x, int n) {
        if(x==1||n==0)
            return 1;
        double power=myPow(x,n/2);
        power*=power;
        if(n%2==0)
        return power;
        else{
            if(n<0)
             return power*(1/x);
            return power*x;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 2;
		int n = 10;
		System.out.println(myPow(x,n));

	}

}
