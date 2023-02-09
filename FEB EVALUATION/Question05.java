import java.util.Arrays;

public class Question05 {
	public static int maxPalindromes(String s,int l,int r) {
		int maxSum = 0;
		int maxSumCount =0;
		String str = s.substring(l-1,r);
		int[] arr = new int[26];
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)-'a']++;		
		}
		int oddCount =0;
		int sum =0;
		int i =0,end =0;
		//System.out.println(Arrays.toString(arr));
		while(end<arr.length-1 && i<arr.length) {
			if(arr[i] == 0) {
				i++;
				if(i == arr.length-1) {
					end++;
					i=end;
					sum-=arr[end];
					i++;
				}
				continue;
			}
			int temp = arr[i];
			if(arr[i]%2!=0) {
				if(oddCount>=1) {
					temp--;
				}
				oddCount++;
			}
			sum+=temp;
			if(sum >maxSum) {
				maxSum = sum;
				maxSumCount = 1;
				//System.out.println(maxSum);
			}
			else if(sum == maxSum) { 
				maxSumCount++;
				System.out.println(maxSum);
				//System.out.println(maxSumCount);
			}
			if(i== arr.length-1) {
				sum-=arr[end];
				end++;
				i=end;
			}
			i++;
			//System.out.println(i);
		}
		return maxSumCount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madamimadam";
		int l = 4;
		int r =7;
		System.out.println(maxPalindromes(s,l,r));
		
	}

}
