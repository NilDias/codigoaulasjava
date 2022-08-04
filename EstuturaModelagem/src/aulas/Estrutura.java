package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Estrutura {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		

		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		
		
		System.out.print("Entre com o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.print(" Entre com o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.print(" Entre com o terceiro número: ");
		n3 = leia.nextInt();
		
		
		if (n1 > n2 && n1 > n3) {
			System.out.println(" O maior número é : " + n1);
		}
		else if (n2 > n3) {
			System.out.println(" O maior numero é " + n2);
		}
		
		//if(n1 > n2) {
			//System.out.printf(" Numero %d é maior", n1);
		//}
		else {
			System.out.printf(" Numero %d é maior", n2);
		}
		
		
		
		leia.close();
	}

}
