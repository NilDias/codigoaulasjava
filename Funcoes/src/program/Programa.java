package program;

import java.util.Locale;
import java.util.Scanner;

import entities.FormulaHeron;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		FormulaHeron fh = new FormulaHeron();
		
		System.out.print(" Entre com os 3 lados do triângulo ");
		fh.lado1 = sc.nextDouble();
		fh.lado2 = sc.nextDouble();
		fh.lado3 = sc.nextDouble();
		
		System.out.printf( " O valor da area do triângulo é : %.2f  " , fh.CalcularAreaTriangulo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
