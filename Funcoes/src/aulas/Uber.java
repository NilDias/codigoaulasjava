package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Uber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		double vlrcom = 0.0;
		double kmrodado = 0.0;
		double lucro = 0.0;
		double litros =0.0;
		double vlruber = 0.0;
		double mdkm = 0.0;
		double combgasto = 0.0;
		double despesa = 0.0;
		
		System.out.print(" Entre com a Kilometragem rodada: ");
		kmrodado = sc.nextDouble();
		
		System.out.print(" Entre com a valor por litro do combustível usado: R$  ");
		vlrcom = sc.nextDouble();
		
		System.out.print(" Entre com e média de km do carro por litro  ");
		mdkm = sc.nextDouble();
		
		litros = ( kmrodado / mdkm);
		
		System.out.printf(" \n Vc gastou : %.2f litros de combustível "  , litros);
		
		combgasto = ( litros * vlrcom);
		
		System.out.printf( " \n Seu gasto em reais com o combustível foi: R$  %.2f" , combgasto);
		
		System.out.print("  \n Entre com valor com despesas gerais no dia: R$ ");
		despesa = sc.nextDouble();
		
		System.out.print( " \n Entre com o valor repassado pela Uber no dia: ");
		vlruber = sc.nextDouble();
		
		
		lucro = (( vlruber - combgasto) - despesa);
		
		System.out.printf("  \n Seu lucro no dia foi: %.2f" , lucro);
		
		sc.close();
	}

}