import java.util.Arrays;

public class MoveZerotoLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int[]arr={1, 2, 0, 4, 3, 0, 5, 0};
		int index=n;
		for(int i =0;i<8;i++) {
			if(arr[i]==0) {
				index=i;
				break;
			}
		}
		int i=index,j=index+1;
		while(i<n&&j<n) {
			if(arr[j]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
