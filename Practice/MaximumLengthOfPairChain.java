import java.util.Arrays;

public class MaximumLengthOfPairChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] pairs= {{5, 24}, {39, 60}, {15, 28}, {27, 40}, {50, 90} };
		Arrays.sort(pairs,(a,b)->a[1]-b[1]);
		int res = maxPair(pairs,0,Integer.MIN_VALUE);
		System.out.println(res);

	}

	private static int maxPair(int[][] pairs, int index, int preValue) {
		if(index==pairs.length)
			return 0;
		int pick=0,unpick;
		if(pairs[index][0]>preValue) {
			pick=1+maxPair(pairs,index+1,pairs[index][1]);
		}
		unpick = maxPair(pairs,index+1,preValue);
		return Math.max(pick, unpick);
		
	}

}
