//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int X = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.closest3Sum(Arr, N, X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int closest3Sum(int A[], int N, int X)
    {
        Arrays.sort(A);
        // code here
        int minDiff =Integer.MAX_VALUE;
        int closest = 0;
        //[-4,-1,1,2]
        for(int i=0;i<N-2;i++){
            int  l = i+1;
            int r =N-1;
            while(l<r){
                int sum = A[i]+A[l]+A[r];
                if(sum == X)
                    return sum;
                int diff =Math.abs(sum-X);
                if(minDiff>diff){
                    minDiff=diff;
                    closest=sum;
                 //   System.out.println(closest);
                }
                if(sum<X)l++;
                else r--;
                    
            }
        }
        return closest;
    }
}
