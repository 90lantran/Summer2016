import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class MakePalindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        StringBuilder sb = new StringBuilder(number);
        int start = 0;
        int end = n - 1;

        Queue<Integer> q = new LinkedList<Integer>();
        while ( k > 0 && end > start){
            if (number.charAt(end) != number.charAt(start)){
                sb.setCharAt(end,'9');
                sb.setCharAt(start,'9');
                k--;
            } else {
                q.add(start);
                q.add(end);
            }
              start++;
                end--;
            
        }
        if(k >= 0 && start >= end){
            while (k > 0 && !q.isEmpty()){
                sb.setCharAt(q.remove(),'9');
                sb.setCharAt(q.remove(),'9');
                k--;
            }
            System.out.println(sb.toString());
        }else {
            System.out.println(-1);
        }
    }
}

