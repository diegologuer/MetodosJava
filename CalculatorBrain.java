
public class CalculatorBrain {

	public static void main(String[] args) {
		
	int pruebaSuma = suma(2,7);
	System.out.println(pruebaSuma);
	
	int pruebaResta = resta(2,7);
	System.out.println(pruebaResta);
	
	int pruebaMulti = multi(2,7);
	System.out.println(pruebaMulti);
	
	double pruebaDiv = div(2,7);
	System.out.println(pruebaDiv);
	
	int pruebaPot = powerOf(2, 4);
	System.out.println(pruebaPot);
	
		
		
		
		
		

	}
	public static int suma(int a, int b) {
		return a+b;
	}
	
	public static int resta(int a, int b) {
		return a-b;
	}
	
	public static int multi(int a, int b) {
		return a*b;
	}
	
	public static double div(int a, int b) {
		return a/b;
	}
	
	public static double squareRoot(int a) {
		return Math.sqrt(a);
	}
	
	public static int powerOf(int base, int exponent ) {
		int result = 1;
		for(int i=1; i<=exponent; i++) {
			result *= base;
		}
		return result;
		
	}
}
