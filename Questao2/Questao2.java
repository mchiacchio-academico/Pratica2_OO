package Questao2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		Scanner ler=new Scanner(System.in);
		
		System.out.println("Entre com o investimento inicial: ");
		float investInicial=ler.nextFloat();
		System.out.println("Entre com a taxa: ");
		float taxa=ler.nextFloat();
		System.out.println("Entre com o número de meses do investimento: ");
		int numMeses=ler.nextInt();
	}
	
	RendimentosInvest ri = new RendimentosInvest(investInicial, taxa, numMeses);
	
	System.out.printf("Seu rendimento no final dos meses será de : %.2f\n", ri.rendimento());
}
