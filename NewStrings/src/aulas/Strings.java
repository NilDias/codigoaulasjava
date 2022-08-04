package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		/* String Frase = "O Nilson é o Bolsonaro";
		char caractere = 's';
		
		
		System.out.println(Frase.length()); // conta quantidade até espaços em branco
		
		System.out.println(Frase.charAt(6)); // localiza o caracter
		
	    System.out.println(Frase.lastIndexOf("N")); // localiza ultima ocorrência da letra usada
	    
	    System.out.println(Frase.concat(" Foi eleito"));// concatena Strings
	    
	    System.out.println(Frase.compareTo(" Algo aqui ")); // compara letras iguais
	    
	    System.out.println(Frase.contentEquals("O Nilson é o Bolsonaro" ));// procura frase iguais.
	    
	    System.out.println(Frase.endsWith("o")); // pega a última ocorrencia.
	    
	    System.out.println(Frase.trim().endsWith("o"));
	    
	    System.out.println(Frase.trim()); // remove espaços.
	    
	    System.out.println(Frase.toLowerCase()); // toda frase em minuscula.
	    
	    System.out.println(Frase.toUpperCase()); // toda frase em maiscula.
	    
	    System.out.println(Frase.replace("o","a")); // altera o conjunto de letras
	    
	    System.out.println(Frase.replaceAll("Nilson", "Luan"));
	    
	    System.out.println(Frase.isBlank()); // verifica se string tem valor, false or true.
	    
	    double  x = 1234.6789;
	    
	    System.out.println(String.format("%.2f", x ));
	    
	    System.out.println(Character.toUpperCase(caractere));
	   
	    
	    System.out.println(Character.toLowerCase(caractere));
	    */
		
		System.out.println("-----URNA-----");
		System.out.println("(13) lulaMlousco");
		System.out.println("(17) bolsoNelson");
		System.out.println("-----Urna-------");
		
		
		
		double votos = sc.nextInt();
		double lulaMolusco=0;
		double bolsoNelson=0;
		
		
		while (votos>=0) {
			if (votos==13) {
				System.out.println(" Seu voto foi para o Canditado lulaMolusco ");
			} else if (votos==17) {
				System.out.println(" Seu voto foi para o Canditado bolsoNelson ");
			}else {
				System.out.println(" Voto finalzado ");
			}
		votos = sc.netxLine();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
