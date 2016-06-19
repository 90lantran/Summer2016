
public class Partition {
	public static void main(String[] args){
		int[] arr = {1, 7, 4, 2, 6, 8, 5, 3};
//		int p = arr[arr.length -1];
//		int i = -1;
//		for(int j = 0; j < arr.length - 1; j++){
//			if(arr[j] < p){
//				i++;
//				swap(arr, i, j);
//			}
//		}
//		i++;
//		swap(arr, i, arr.length - 1);
//		for (int x : arr){
//			System.out.println(x);
//		}
	
		Partition p = new Partition();
		
		p.partition(arr, 0, arr.length - 1);
		
		for (int x : arr){
		System.out.println(x);
	}
		
	}
	
	
	
	private int partition(int[] arr, int p, int r){
		int i = p -1;
		for (int j = p; j <= r - 1; j++){
			if (arr[j] < arr[r]){
				i++;
				swap(arr, i, j);
			}
		}
		i++;
		swap(arr,i,r);
		return i;
	}
	
	private static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
