import java.util.List;
import java.util.ArrayList;
public class Question04 {
	public static boolean findPassword(String loginAttempt, String[] wordDict,int i,List<String> arr) {	       
        boolean flag=false;
        if(loginAttempt.length() == i){
            return true;
        }
        for(String word:wordDict){
                if(word.length()>loginAttempt.length()){
                    continue;
                }
                int wordLength = word.length();  
                if(wordLength+i <= loginAttempt.length()  && word.equals(loginAttempt.substring(i,wordLength+i))){
                arr.add(word);
                flag = findPassword(loginAttempt,wordDict,i+wordLength,arr);
                
                if(flag)
                		return true;
                else 
                	return false;
                }
        }
        return false;
	}
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab abcd cd";
		String loginAttempt = "abcd";
		String wordDict[] = s.split(" ");
		List<String> arr = new ArrayList<>();
		if(findPassword(loginAttempt,wordDict,0,arr)) {
				String password ="";
				for(String str:arr) {
					password+=str+" ";
				}
				System.out.println(password);
			}
			else {
				System.out.println("WRONG PASSWORD");
			}
			
		}
	
	}
/*
 * "because can we do must we what";
 * "wedowhatwemustbecausewecan";
 * 
 * 
 * "hello world";
 * helloplanet";
 */

