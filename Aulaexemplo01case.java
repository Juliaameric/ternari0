package lpa;

import java.util.Scanner;

public class Aulaexemplo01case {

	public static void main(String[] args) {
	
			Scanner ler = new Scanner(System.in);
			
			System.out.println("escolha um numero entre 1 a 3");
			int numero = ler.nextInt();
			
			switch (numero) {
			case 1:
				System.out.println("o numero escolhido foi: 1.");
				break;
			case 2:
				System.out.println("o numero escolhido foi: 2.");
				break;
			case 3:
				System.out.println("o numero escolhido foi: 3.");
				break;
			default:
				System.out.println("o numero escolhido é invalido! Digite um numero entre 1 a 3");
			}
	}

}
