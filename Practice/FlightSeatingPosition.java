
public class FlightSeatingPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 108;
		int count = 0;

		int num = n % 6;
		if (num == 0 || num == 1)
			System.out.print("WS ");
		else if (num == 2 || num == 5)
			System.out.print("MS ");
		else
			System.out.print("AS  ");

	}

}
