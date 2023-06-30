//User function Template for Java
//  count no of ones in odd and even position subratct tehm check divisible by 3 
class Solution {
    int isDivisible(String s) {
        // code here
        int even =0,odd=0;
        int n =s.length();
      //  int number =Integer.parseInt(s);
        for(int i=0;i<n;i++){
           if(s.charAt(i)=='1'){
               if(i%2==0)
                    odd++;
                else
                    even++;
           }
        }
      // System.out.println(num);
        return ((odd-even)%3==0)?1:0;
    }
}
