/*
 * Georgios Loudaros
 * Method cosh in Trigonometry - Hyperbolic
 */

import java.util.Scanner;

public class Trigonometry_cosh{

    
    public static void main(String []args){
       	
       	
       	Scanner input = new Scanner (System.in);
        double x;
        x = input.nextDouble();
       	
        double total = cosh(x);
        
        System.out.println("Cosh " + x + " = " + total);    

    }
    
    
    //Method Factorial
    
    public static int factorial(int n) {
        int i, result=1;
        for (i=1; i<=n; i++) {
            result *= i;
        }
        return result;
    }
    
    //Method cosh
    
    public static double cosh(double x) {
        
        int n=1;
        int p;
        double sum = 1.00;
       	double klasma=1;
        
        while (true) {
        
			p = factorial(2*n);
			klasma = (Math.pow(x, 2*n)) / p;
			
			if (klasma < 0.00001){
				break;
			}
			
			sum = sum + klasma;  
			n++;
        
        
        }
    
        return sum;
    }
    
}