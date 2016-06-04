import java.util.Scanner;

/*
 * You are the benevolent ruler of Rankhacker Castle, and today you're distributing bread to a straight line of subjects. Each  subject (where ) already has  loaves of bread.

Times are hard and your castle's food stocks are dwindling, so you must distribute as few loaves as possible according to the following rules:

Every time you give a loaf of bread to some person , you must also give a loaf of bread to the person immediately in front of or behind them in the line (i.e., persons  or ).
After all the bread is distributed, each person must have an even number of loaves.
Given the number of loaves already held by each citizen, find and print the minimum number of loaves you must distribute to satisfy the two rules above. If this is not possible, print NO.
 
 *Sample Input 0
5
2 3 4 5 6
Sample Output 0
4

Sample Input 1
2
1 2
Sample Output 1
NO
 *
 */
public class HourRank9_1_FairRotation {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0; i < N - 1; i++){
            if (B[i] %2 == 1){
                B[i]++;
                B[i+1]++;
                count += 2;
            }
        }
        if (B[N-1] % 2 == 0){
            System.out.println(count);
        } else {
            System.out.println("NO");
        }
    }
}
