//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        boolean[] bool  =new boolean[n+1];
        int[] a = new int[2];
        long sum = n*(n+1)/2;
        long arrSum =0;
        for(int i =0;i<n;i++){
            if(bool[arr[i]]){
                a[0]= arr[i];
            }
            else{
                bool[arr[i]]=true;
                arrSum+=arr[i];
            }
        }
        for(int i=1;i<n+1;i++){
            if(!bool[i]){
                a[1]=i;
                break;
            }
        }
       
        return a;
    }
}
