package InterviewQueue;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class InterviewApplication {
	static Queue<Applicant> applicantQueue = new LinkedList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Interview panel");
		System.out.println("------------------------------");
		Scanner sc = new Scanner(System.in);
		String addCandidate;
		while(true) {
			System.out.println("Enter the Candidate Name:");
			String name  = sc.next();
			System.out.println("Enter Age:");
			int age =sc.nextInt();
			System.out.println("Enter Email Id:");
			String emailId= sc.next();
			System.out.println("Enter Contact number:");
			Long number = sc.nextLong();
			Applicant applicant = Applicant.addApplicant(name,age,emailId,number);
			if(applicant != null) {
				applicantQueue.add(applicant);
			}
			else {
				System.out.println("Invalid Data Please try again later");
				continue;
	
			}
			System.out.println("Do you want to add new candidate");
			addCandidate = sc.next().toLowerCase();	
			if(addCandidate.equals("no"))
				break;
		}
		sc.close();
		System.out.println("Interview Status");
		while(!(applicantQueue.isEmpty())){
			interviewStatus();
		}
		System.out.println("------------------------------------");
		System.out.println("Interview is done for all candidates");
		
		
	}
	public static void interviewStatus() {
		System.out.println("\nCurrent Candidate");
		System.out.println("-------------------\n");
		System.out.println(applicantQueue.poll());
		if(!(applicantQueue.isEmpty())) {
		System.out.println("\nUpcoming Candidate");
		System.out.println("--------------------\n");
		System.out.println(applicantQueue.peek());
		System.out.println("------------------------------");
		}
	}

}
