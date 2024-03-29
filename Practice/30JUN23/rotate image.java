//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int matrix[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(st[k++]);
            }
            Solution ob = new Solution();
            ob.rotateby90(matrix, n);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][], int n) 
    { 
        // code here
        transpose(matrix,n);
        reverseRow(matrix,n);
    }
    private static void transpose(int[][] matrix,int n){
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i<=j){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i] = temp;
                }
            }
        }
        
    }
    private static void reverseRow(int[][] matrix,int n){
        for(int i=0;i<n/2;i++){
            for(int j =0;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[n-1-i][j];
                matrix[n-1-i][j] = temp;
            }
        }
    }
}
