package InterviewQueue;
import java.util.regex.*;
public class Applicant {
	private String applicantName;
	private int age;
	private String emailId;
	private long number;
	private Applicant(String name,int age,String emailId,long number){
		this.applicantName =name;
		this.age = age;
		this.emailId= emailId;
		this.number = number;
			
	}
	static boolean validateEmail(String emailId) {
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9]*@[a-zA-Z0-9]+[.][com]");
		Matcher m = p.matcher(emailId);
		if(!(m.find())) {
			System.out.println("Please Enter the correct Email");
			return false;
		}
		return true;
	}
	static boolean validatePhone(long number) {
		Pattern p = Pattern.compile("[7-9][0-9]{9}");
		String num = Long.toString(number);
		Matcher m = p.matcher(num);
		if(m.find() && num.length()== 10) {
			return true;
		}
		else {
			System.out.println("Please enter the correct Number");
			return false;
		}
	}
	
	public static Applicant addApplicant(String name,int age,String emailId,long number) {
		Applicant candidate = new Applicant(name,age,emailId,number);
		if(age<18 || age>60) {
			System.out.println("Candidates in this age are not eligible for the interview");
			return null;
		}
		if(!(validateEmail(emailId))) {
			return null;
		}
		candidate.emailId=emailId;
		if(!(validatePhone(number))){
			return null;
		}
		candidate.number = number;
		candidate.applicantName = name;
		return candidate;
			
	}
	public String toString() {
		return "Candidate name  - "+applicantName+"\nAge\t\t- "+age+"\nEmail Id\t- "+emailId+"\nContact Number  - "+number;
	}
}
