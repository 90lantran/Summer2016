import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/contests/hourrank-9/challenges/mandragora
 * Garnet and her pet begin their journey through the evil forest with  strength points and  experience points. For each undefeated mandragora , she can perform either of the following actions:

*Garnet's pet eats mandragora . This increments  by  and defeats mandragora .
*Garnet's pet battles mandragora . This increases  by  experience points and defeats mandragora .
*Each mandragora can only be defeated once, and Garnet can defeat the mandragoras in any order. Given the respective health points for each mandragora, can you find the maximum number of experience points she can earn from defeating all  mandragoras?
 */
public class HourRank9_2_MandragoraForest {
	private static List<Long> result = new ArrayList<Long>();
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numTestCases = sc.nextInt();
        for(int i = 0; i < numTestCases; i++){
            int numM = sc.nextInt();
            long[] H = new long[numM];
            for (int j = 0; j < numM; j++){
                H[j] = sc.nextLong();
                
            }
            Arrays.sort(H);
            process(H,numM);
            
        }
        for (Long r : result){
        	System.out.println(r);
        }
    }
    
    private static void process(long[] H, int numM){
        long sum = 0;
        long currentResult =0 ;
        for (int i = 0; i < numM; i++){
            sum+= H[i];
        }
        for (int i = 0; i < numM; i++ ){
            if (i == 0){
                currentResult = sum;
            } else {
                sum = sum - H[i-1];
                long tempResult = (i + 1)*sum;
                currentResult = Math.max(tempResult, currentResult);
            }
        }
        result.add(currentResult);
        
    }
}
