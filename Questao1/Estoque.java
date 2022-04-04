package Questao1;

import java.util.Scanner;

public class Estoque {
	
	Scanner ler = new Scanner(System.in);

	private String nome;
	private	int qtdAtual;
	private int qtdMinima;
	
	public Estoque(String nome, int qtdAtual, int qtdMinima) {
		this.nome = nome;
		this.qtdAtual = qtdAtual;
		this.qtdMinima = qtdMinima;
	}

	public String getNome() {
		return nome;
	}

	public int getQtdAtual() {
		return qtdAtual;
	}

	public int getQtdMinima() {
		return qtdMinima;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setQtdAtual(int qtdAtual) {
		this.qtdAtual = qtdAtual;
	}

	private void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	
	public void darBaixa(int qtde) {
		while ((qtdAtual - qtde) < 0){
            System.out.println("A quantidade no estoque não pode ficar negativa");
            System.out.println("Digite outro número: ");
            qtde = ler.nextInt();
        }
		setQtdAtual(qtdAtual - qtde);
	}
	
	public void mostrarEstoque() {
		return "Produto: " + String.format("%s \n",nome) + "Quantidade minima: "+ String.format("%d \n", qtdMinima) + "Quantidade atual: " + qtdAtual;
	}
	
	public boolean precisaRepor(){
        if (qtdAtual <= qtdMinima){
            return true;
        }
        else {
            return false;
        }
    }

}
