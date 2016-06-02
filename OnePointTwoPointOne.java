import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class OnePointTwoPointOne {

	public static void main(String[] args) {
		Random r = new Random(0);
		//double x = r.nextDouble();
		//double y = r.nextDouble();
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] x = new double[n];
		double[] y = new double[n];
		
		for (int i = 0; i < n ; i++){
			x[i] = r.nextDouble();
			y[i] = r.nextDouble();
		}
		List<Double> distances = new ArrayList<Double>();
		
		for(int i = 0; i < n; i++){
			for (int j = i + 1; j <n; j++){
				distances.add(Math.sqrt((Math.pow((x[i] - x[j]),2) + Math.pow((y[i] -y[j]),2))));
			}
		}
		Double[] z = distances.toArray(new Double[distances.size()]); 
		Arrays.sort(z);
		
		for(int i = 0; i < z.length; i++){
			System.out.println(z[i]);
		}
		
		
		
	}

}
