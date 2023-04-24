// Given an array where each element (arr[i]) represents the height of the tower. Find for each tower, 
// the nearest possible tower that is shorter than it. You can look left or right on both sides.


class Solution{
	int [] nearestSmallestTower(int [] arr){
		//Write your code here
		int n =arr.length;
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();	
		int[] result = new int[arr.length];
		int[] res = new int[arr.length];
		Arrays.fill(result,-1);
		for(int i =0;i<arr.length;i++){
		    while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
		           stack.pop();
		        }
		    if(!stack.isEmpty() && arr[i]!=arr[stack.peek()])
		        result[i]= stack.peek();
		    else
		         result[i]= -1;
		        
		    stack.push(i);
		    
		   
		}
		for(int i = n-1;i>=0;i--){
		      while(!stack2.isEmpty() && arr[i]<=arr[stack2.peek()]){
		           stack2.pop();
		        }
		    if(!stack2.isEmpty()&&  arr[i]!=arr[stack2.peek()]){
		      
		        res[i]= stack2.peek();
		    }
		        
		    else
		         res[i]= -1;
		        
		    stack2.push(i);
		}
		int[] ans = new int[n];
		for(int i=0;i<n;i++){
		    if(result[i]==-1)
		        ans[i] = res[i];
		    else if(res[i]==-1)
		        ans[i] = result[i];
		    else if(Math.abs(i-result[i])>Math.abs(i-res[i]))
		        ans[i] = res[i];
		    else if(Math.abs(i-result[i])<Math.abs(i-res[i]))
		        ans[i] = result[i];
		    else{
		        if(arr[result[i]]>arr[res[i]])
		            ans[i]=res[i];
		        else
		            ans[i] = result[i];
		    }
		    
		    
		}
		
	
		
		return ans;
		
	}
}
