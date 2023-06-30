// GFG

class Solution{
    
    static int subsetXOR(int arr[], int n, int k) {
        // code here
     return subsetSum(arr,0,n,0,k);
    
    }
    private static int subsetSum(int[] arr,int i,int n,int xor,int k){
        if(i==n){
            if(xor==k)
                return 1;
            return 0;
        }
        int count =0;
        count=subsetSum(arr,i+1,n,xor^arr[i],k);
        count +=subsetSum(arr,i+1,n,xor,k);
        return count;
    } 
}
