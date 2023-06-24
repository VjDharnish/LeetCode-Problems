class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
       
        int r = str.length();
         if(k>r)
            return 0;
        int count =0;
        for(int i =0;i<n;i++){
            if(arr[i].length()>=k && arr[i].substring(0,k).equals(str.substring(0,k)))
                count++;
        }
        return count;
    }
}
