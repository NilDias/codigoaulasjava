package entities;

public class FormulaHeron {

	    public double lado1 = 0.0;
		public double lado2 = 0.0;
		public double lado3 = 0.0;

		public double CalcularAreaTriangulo() {
			double p = (lado1 + lado2 + lado3)/ 2;
			double area = Math.sqrt(p * ( p - lado1)* (p - lado2) * (p -lado3));
			return area ;
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
}