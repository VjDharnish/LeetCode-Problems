// Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.

// Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.

 

// Example 1:

// Input: n = 12
// Output: 21
  
class Solution {
    public int nextGreaterElement(int n) {
       
        String s = n+"";
        char[] arr = s.toCharArray();
        int i =0,j=0;
        for(int k =arr.length-2;k>=0;k-- ){
            if(arr[k]<arr[k+1]){
                i =k;
                break;
            }

        }
        for(int k =arr.length-1;k>=0;k-- ){
            if(arr[k]>arr[i]){
                j=k;
                break;
            }

        }
        char temp = arr[i];
        arr[i]=arr[j];
        arr[j] =temp;

        if(i==j)
            reverse(arr,0);
        else
            reverse(arr,i+1);
        String nw = new String(arr);
        try{
        int a = Integer.parseInt(nw);
       //  System.out.println(a);
        if(a<0 || a<=n)
       return -1;
       else
            return a;
        }catch(Exception e){
            return -1;
        }
       
    }
    private void reverse(char[] arr,int k){
        int n =arr.length-1;
        
        while(k<n){
            char temp = arr[k];
            arr[k] = arr[n];
            arr[n]=temp;
            k++;
            n--;
        }
    }
}
