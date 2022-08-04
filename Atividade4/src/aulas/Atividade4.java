package aulas;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		/*System.out.println(" entre com o numero: ");
		int numero = leia.nextInt();

		switch (numero) {
		case 1:

			System.out.println("Voce escolheu o  sanduiche natureba 1");
			break;

		case 2:

			System.out.println("Voce escolheu o sanduba Bomba");
			break;

		case 3:
			System.out.println(" Voce Escolheu a Coxinha de jaca");
			break;

		case 4:
			System.out.println(" Voce escolheu a feijoada vegetariana");
			break;

		}*/

		/*String login;
		String logincadastrado = "Nilson Dias";
		int senha = 0;
		int senhacadastrada = 2;
		//leia.nextLine();
		
		System.out.println(" Digite seu login ");
		login = leia.nextLine();

		System.out.println(" Digite sua senha ");
		senha = leia.nextInt();

		if (login.equals(logincadastrado)) {
			System.out.println(" CADASTRO OK");
		} else {
			System.out.println(" Login e senha ERRADA");

		}*/
		
		System.out.println(" entre com um numero entre 1 e 7: ");
		int numero = leia.nextInt();
		
		switch (numero) {
		case 1:

			System.out.println("Voce escolheu o numero 1 Domingo");
			break;

		case 2:

			System.out.println("Voce escolheu o numero 2 Segunda");
			break;

		case 3:
			System.out.println(" Voce escolheu o numero 3 Terça");
			break;

		case 4:
			System.out.println(" Voce escolheu o numero 4 Quarta");
			break;

		case 5:
			System.out.println(" Voce escolheu o numero 5 Quinta");
			break;
			
		case 6:
			System.out.println(" Voce escolheu o numero 6 Sexta");
			break;
			
			
		case 7:
			System.out.println(" Voce escolheu o numero 4 Sabado");
			break;
		
		}
		leia.close();
	}

}
