/*
 * Georgios Loudaros
 * Gauss–Seidel method in Linear Algebra
 */
 
import java.util.Arrays;

public class GaussSeidel{

	public static void main(String[] args){
		
		//Random Numbers
		double[][] A = {
						{10, -1, 2, 0},
						{-1, 11, -1, 3},
						{2, -1, 10, -1},
						{0, 3, -1, 8}
						};
		double[] b = {6, 25, -11, 15};
		double[] x = {0, 0, 0, 0};
		
		System.out.println("Result = " + Arrays.toString(gaussSeidel(A, b, x)));

	}
	
	public static double[] gaussSeidel(double[][] A, double[] b, double[] x){
		
		double residual = 2;
		double[] xOld = x.clone();
		
		while (residual > 0.00000000000001){	//end	
			
			for (int i = 0 ; i < b.length; i++){
				x[i] = (1/A[i][i]) *( b[i] - product(A, x, i) + A[i][i]*x[i]);
			}
			
			residual = 0; 
			
			for (int i =0; i < xOld.length ; i++){
				
				residual += Math.abs(xOld[i] - x[i]);
			}
			xOld = x.clone();
		}
		return x; 
	}	
	
	private static double product(double[][] A, double[] x, int index) {
		double sum = 0;
		for (int i = 0; i < x.length ; i++) {
			sum += A[index][i] * x[i];
		}
		return sum;
	}

}