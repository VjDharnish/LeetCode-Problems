class Solution {
    static int setBits(int N) {
        // code here
        int num =0;
        int cnt =0;
        while(N!=0){
            num = N%2;
            N/=2;
            if(num==1)
                cnt++;
        }
        return cnt;
        
    }
}

  #User function Template for python3
class Solution:
    def setBits(self, N):
        # code here
        binary =str(bin(N))
        count=0;
        for i in binary:
            if i=='1':
                count+=1
        return count
