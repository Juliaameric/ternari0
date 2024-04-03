package lpa;

import java.util.Scanner;

public class Atividade1string {

	public static void main(String[] args) {
		String frase;
		Scanner ler = new Scanner (System.in); 
			System.out.println("informe uma frase : ");
			frase = ler.nextLine();
			
			int tamanho = frase.length();
			System.out.println("tamanho da frase: "+ tamanho);
			
			int posicao;
			System.out.println("Escreva a posição do caractere: ");
			posicao = ler.nextInt ();
			
			char letra = frase.charAt(posicao);
			System.out.println("O caractere é: " + letra);
			
			String palavra = ("Olá Mundo!");
			boolean resultado = (frase.equals(palavra));
			   System.out.println (resultado);
	}

	}


