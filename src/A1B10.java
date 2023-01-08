import java.util.Scanner;
public class A1B10 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        String result="";
        int num=0,count=0;
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i)>=48 && str.charAt(i)<=57 ) {
        		num= str.charAt(i) - 48;
        		if(i!=str.length()-1) {
        		if(str.charAt(i+1)>=48 && str.charAt(i+1)<=57) {
        			num=num*10+ (str.charAt(i+1)-48);
        			count=1;
        			i++;
        		}
        		
        	}
        		
        	for(int j=0;j<num;j++) {
        		if(count ==0)
        			result+=str.charAt(i-1);
        		else
        			result+=str.charAt(i-2);
        	}
        	count =0;
        	
        }
        }
        System.out.println(result);

    }
}
