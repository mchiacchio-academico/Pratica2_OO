package Questao1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner ler=new Scanner(System.in);
		
		System.out.print("Digite o nome do produto: ");
        String nome = ler.nextLine();
        System.out.print("Digite a quantidade minima do produto: ");
        int minima = ler.nextInt();
        System.out.print("Digite a quantidade atual do produto: ");
        int atual = ler.nextInt();
        
        Estoque produto = new Estoque(nome, atual, minima);

        System.out.println();
        System.out.print("Digite a quantidade que deseja dar baixa no estoque: ");
        produto.darBaixa(ler.nextInt());
		
        System.out.println();
        System.out.printf(produto.mostrarEstoque());
        System.out.println();

        if (produto.precisaRepor() == true){
            System.out.println("O produto precisa de reposição");
            
            
            else {
            	System.out.println("O produto não precisa de reposição");
         
            }
        }
	}


