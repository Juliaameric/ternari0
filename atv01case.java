package lpa;

import java.util.Scanner;

public class atv01case {

	public static void main(String[] args) {
		
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("informe o dia da semana");
		String dia = ler.next();
	
		switch (dia) {
		
		case ("domingo"):
			System.out.println("o dia é 1.");
			break;
		case ("segunda"):
			System.out.println("o dia é 2.");
			break;	
		case ("terça"):
			System.out.println("o dia é 3.");
			break;
		case ("quarta"):
			System.out.println("o dia é 4.");
			break;
		case ("quinta"):
			System.out.println("o dia é 5.");
			break;	
		case ("sexta"):
			System.out.println("o dia é 6.");
			break;
		case ("sabado"):
			System.out.println("o dia é 7.");
			break;
		default:
			System.out.println("dia invalido");
		}
	}

}
