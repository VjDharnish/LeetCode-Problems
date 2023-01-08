
public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		int arr[] = {1,2,3,4,1,2,3,5,6,8,6};
		int freq[] = new int[arr.length];
	    int n=arr.length;
		for(int i=0;i<n-1;i++) {
			if(freq[i]==-1)
				continue;
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j]= -1;
			}			
			}
			if(count>1)
				System.out.println(arr[i]);
			
		}
		
	}

}
