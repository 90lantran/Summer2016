
/**
 * Skienna Chapter 7
 * @author alantran
 *
 */
public class ConstructAllSubsets {
	boolean finished = false;
	public static void main(String[] args){
		
		boolean[] a = new boolean[3];
		int n = a.length;
		ConstructAllSubsets obj = new ConstructAllSubsets();
		obj.backTrack(a, 0, n);
		
	}
	private void backTrack(boolean[] a, int k, int n){
		boolean[] c = new boolean[2];
		Integer ncandidates = 0;
		int i = 0;
		
		if(isASolution(a,k,n)){
			processSolution(a,k,n);
		}else {
			//k = k + 1;
			c = constructCandidates(a, k, n, c, ncandidates);
			for( i = 0; i < c.length ; i++){
				a[k] = c[i];
				backTrack(a, k + 1, n);
				if (finished) return;
			}
		}
	}
	
	private boolean isASolution(boolean[] a, int k, int n){
		return k == n;
	}
	
	private void processSolution(boolean[] a, int k, int n){
		int i;
		System.out.print("{ ");
		for (i=0; i< k; i++)
		/* counter */
		        if (a[i] == true) System.out.print(i + 1 +" ");
		System.out.println(" }\n");
		
	}
	
	private boolean[] constructCandidates(boolean[] a, int k, int n, boolean[] c, 
			Integer ncandidates){
		c[0] = true;
		c[1] = false;
		//ncandidates = 2;
		return c;
	}
	
}
