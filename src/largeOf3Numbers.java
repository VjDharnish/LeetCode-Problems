
public class largeOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method1
		int x =77,y=29,z=20;
		System.out.println(Math.max(x, Math.max(y, z)));
		//method 2
		int max = x>y?x:y ;
		System.out.println(max>z?max:z);
	    

	}

}
