package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double idade = 0.0;
		char sexo;
		double peso = 0.0;
		double altura = 0.0;
		double imc = 0.0;
		double gas = 0.0;
		double alc = 0.0;
		double comb = 0.0;
		double a = 0.0;
		double p = 0.0;
		double s = 0.0;
		
		
		
		
		
		System.out.print(" Entre com a sua idade: ");
		idade = sc.nextDouble();
		
		System.out.print(" entre com o Sexo : ");
		s = sc.next().charAt(0);
		
		System.out.print( " Entre com o seu peso: ");
		p = sc.nextDouble();
		
		System.out.print( " Entre com sua Altura: ");
		a = sc.nextDouble();
		
		imc = peso / (altura*altura);
		
		System.out.printf( " Seu imc é : %.2f " , imc );
		
		if (imc <= 24)  {
			System.out.println( " Seu IMC está ótimo " );
		}
		else if (imc>24) {
			System.out.println(" Seu imc está acima dos limites ");
		}
		
		
		
		
		System.out.print(" Entre com o valor da gasolina: ");
		gas = sc.nextDouble();
		
		System.out.print(" Entre com o valor do alcool: ");
		alc = sc.nextDouble();
		
		comb = (alc/gas);
		
		System.out.printf(" O valor do comb é %.2f: " , comb);
		
		if (comb > 0.70) {
			System.out.println( " Vale a pena colocar gasolina ");
		}
		else if ( comb < 0.70) {
			System.out.println(" vale a pena colocar alcool ");
		}
			
		
		
		CalcularImc, ( a, p, char);
		
		
		sc.close();
		
		
		
	}
	
	public static String CalcularImc(double a, double p,Class<Character> class1)	{
		double imc = (p/ (a * a));
		
		if(Character.toUpperCase(class1) == 'M' && imc < 20.7) {
			return "abaixo do peso";
			
		}else if (Character.toUpperCase(class1) == 'M' && imc >= 20.7 && imc <26.4) {
			return "peso normal, imc: " + imc;
		}else if (Character.toUpperCase(class1)== 'M' && imc >= 26.4 && imc < 27.8){
			return " Marginalmente acima do peso, imc: " + imc;
		}else if (Character.toUpperCase(class1) == 'M' && imc >= 27.8 && imc <31.1) {
			return " Acima do peso ideal, imc: " + imc;
		}
		else {
			return " Obeso, imc: " + imc;
		}
		
		
		
	}
	
		public static void GasOuAlc ( double a, double g) {
			if( a / g >= 0.70) {
				System.out.println(" Compensa colocar gasolina!");
			}
		}
		
	}

