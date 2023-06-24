import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */
    
    public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
    // Write your code here
        int left = c_q-1;
        int right = n-c_q;
        int up = n-r_q;
        int down= r_q-1;
        int leftUp  = Math.min(down,right);
        int rightUp = Math.min(up,right);
        int leftDown = Math.min(down,left);
        int rightDown = Math.min(up,left);
        for(List<Integer> obs:obstacles){
            int r_o = obs.get(0);
            int c_o = obs.get(1);
            if(c_q==c_o){ // Smae Column
                if(r_q<r_o) // up
                    up = Math.min(up,r_o-r_q-1);
                else // Down
                    down = Math.min(down,r_q-r_o-1);
            } 
            else if(r_q==r_o){ // Smae Row
                if(c_q<c_o) // right 
                    right  = Math.min(right,c_o-c_q-1);
                else // left
                    left = Math.min(left,c_q-c_o-1);
            }
            else if(r_q+c_q == r_o+c_o){ // left cross Do9agnolc || posuituve diuagnol 
                if( c_o > c_q) // left UP  
                    leftUp   = Math.min(leftUp,c_o-c_q-1);
                else //  Righht Down 
                    rightDown  = Math.min(rightDown,c_q-c_o-1);
            } 
            else if(r_q-c_q == r_o-c_o){ // Rihght cross Do9agnolc || Negative diuagnol 
                if(c_q<c_o) // right UP  
                    rightUp   = Math.min(rightUp,c_o-c_q-1);
                else //  left Down 
                    leftDown  = Math.min(leftDown,c_q-c_o-1);
            } 
            
        }
        return left+right+up+down+leftUp+leftDown+rightUp+rightDown;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r_q = Integer.parseInt(secondMultipleInput[0]);

        int c_q = Integer.parseInt(secondMultipleInput[1]);

        List<List<Integer>> obstacles = new ArrayList<>();

        IntStream.range(0, k).forEach(i -> {
            try {
                obstacles.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
