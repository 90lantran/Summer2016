import java.util.Scanner;


public class ConstructAllSubsets1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = sc.nextInt();
		}
		boolean[] a = new boolean[n];
		ConstructAllSubsets1 obj = new ConstructAllSubsets1();
		obj.backTrack(a, 0, input);
	}
	
	private void backTrack(boolean[] a, int k, int[] input){
		//boolean[] c = new boolean[input.length];
		
		if (isASolution(a, k, input)){
			processSolution(a, k, input);
		} else {
			boolean[] c = constructCandidates(a, k, input);
			for(int i = 0; i < c.length; i++){
				a[k] = c[i];
				backTrack(a, k + 1, input);
			}
		}
	}
	
	private boolean isASolution(boolean[] a, int k, int[]input){
		return k == input.length;
	}
	
	private boolean[] constructCandidates(boolean[] a, int k, int[] input){
		boolean[] c = new boolean[2];
		c[0] = true;
		c[1] = false;
		return c;
	}
	
	private void processSolution(boolean[] a, int k, int[] input){
		System.out.print("{ ");
		for (int i = 0; i < a.length; i ++){
			if (a[i])
			System.out.print(input[i] +" " );
		}
		System.out.print("}");
		System.out.println();
	}
}
