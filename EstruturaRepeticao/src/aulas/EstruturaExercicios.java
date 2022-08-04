package aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaExercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		// um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o
		// valor seja inválido e continue pedindo até que o usuário informe um valor
		// válido.

		int nota = 0;

		System.out.print(" Insira uma  nota Válida: ");
		nota = sc.nextInt();
		do {
			if (nota <= 10) {
				System.out.print("Nota validada, Parabéns ");
			}
			if (nota > 11) {
				System.out.print(" Nota Errada, Tente outra vez ");
			}
			System.out.print(" Insira uma  nota Válida: ");
			nota = sc.nextInt();
		} while (nota >= 11);

		sc.close();

	}

}
