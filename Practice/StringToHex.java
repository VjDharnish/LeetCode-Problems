
public class StringToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello world";
		int  len=str.length();
		StringBuilder sb = new StringBuilder();
		// STring to HExadecimal
		for(int i=0;i<len;i++) {
			sb.append(String.format("%x", (byte)str.charAt(i)));
		}
		String hexString = sb.toString();
		System.out.println(hexString);
		sb.setLength(0);
		// Hexadecimal to String
		for(int i=0;i<hexString.length();i+=2) {
			sb.append((char)Integer.parseInt(hexString.substring(i,i+2),16));
		}
		System.out.println(sb.toString());
		
	
	}

}
