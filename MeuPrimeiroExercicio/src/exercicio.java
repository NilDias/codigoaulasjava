import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		
		
		/*
		String nome;
		int idade = 0;
	    char sexo;
		Double saldoconta = 0.0;
		
		System.out.print(" Entre com o nome da pessoa ");
		nome = leia.nextLine();
		
		System.out.print(" Entre com a idade ");
		idade = leia.nextInt();
		
		
		System.out.print(" Entre com o sexo ");
		sexo = leia.next().charAt(0);
		
		
		
		System.out.print(" Entre com o saldo");
		saldoconta = leia.nextDouble();
		
		System.out.println(nome + " tem " + idade + " anos e seu sexo é " + sexo + " , possui no banco R$ " + saldoconta + " reais ");
		*/
		
		
		
		int peso = 0;
		int altura = 0;
		int imc = 0;
		
		
		
		
		
		System.out.print(" Meu peso é:  " + peso);
		peso = leia.nextInt();
		
		
		System.out.print(" Meu peso é:  " + altura);
		altura = leia.nextInt();
		
		
		
		imc = peso / (altura * altura);
		
		
		System.out.println(" Meu imc é :  " + imc);
		imc = leia.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		leia.close();
	}

}
