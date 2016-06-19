
/**
 * Given an array, find the kth smallest element.
 * @author alantran
 *
 */
public class KthSmallest {
	public static void main(String[] args){
		int[] arr = {1, 7, 4, 2, 6, 8, 5, 3};
		
		int k = 2;
		KthSmallest obj = new KthSmallest();
		obj.partition(arr, 0, arr.length - 1, k);
		
	}
	

	private void partition(int[] arr, int p, int r, int k){
		int i = p -1;
		for (int j = p; j <= r - 1; j++){
			if (arr[j] < arr[r]){
				i++;
				swap(arr, i, j);
			}
		}
		i++;
		swap(arr,i,r);
		if (k == i){
			System.out.println(arr[i]);
		} else if ( k < i){
			partition(arr, p, i-1, k);
		} else {
			partition(arr, i + 1, r, k);
		}
		
		
	}
	
	

	private static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
