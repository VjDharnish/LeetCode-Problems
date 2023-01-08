
public class StaticKeyword {
	static int i =method1();
	static int b;
	//static block
	static {
		System.out.println("2:Static Block executes before main");
	}
	static int method1() {
		
		
		System.out.println("1:Static Method example");
		return 20;
	}
	static void method2() {
		System.out.println("3:Static Method can be called without instance");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.println("Main Executes after Static Block");
	  method2(); // static method is called without instance
      System.out.println(i);//static variable accessed without Object
	}

}
