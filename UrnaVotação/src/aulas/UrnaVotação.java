package aulas;

import java.util.Scanner;

public class UrnaVotação {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----URNA-----");
		System.out.println("(13) lulaMlousco");
		System.out.println("(17) bolsoNelson");
		System.out.println("-----Urna-------");
		
		int molusco = 0;
		int nelson = 0;
		int gomes = 0;
		int bolim = 0;
		int num = 0;
		
		
		System.out.println("Numeros dos Candidados");
		System.out.println("molusco : 31");
		System.out.println(" nelson : 10");
		System.out.println(" gomes  : 51");
		System.out.println(" bolim : 20");
		
		System.out.println( "Qual canditado tem sua intenção de voto?");
		num = sc.nextInt();
	
		do {
		
			switch (num) {
			case 31:
				System.out.println(" seu voto foi registrado");
				molusco += molusco++;
				break ;
			
			case 10:
				System.out.println(" seu voto foi registrado");
				nelson += nelson++;
				break ;	
				
				
				
				
				
		}while(num > 0 && num < 100)
	
		
		sc.close();

	}

}
