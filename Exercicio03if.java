package lpa;

import java.util.Scanner;

public class Exercicio03if {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String dia;
		
		System.out.println("insira o dia da semana");
		dia = ler.next();
		
		if (dia.equals("domingo")) {
			System.out.println(" 1");
		}
		else if (dia.equals("segunda")) {
			System.out.println(" 2");
		}
		else if (dia.equals("terça")) {
			System.out.println(" 3");	
		}
		else if (dia.equals("quarta")) {
			System.out.println("4");	
		}
		else if (dia.equals("quinta")) {
			System.out.println("5");
		}
		else if (dia.equals("sexta")) {
			System.out.println("6");
		}
		else if (dia.equals("sabado")) {
			System.out.println("7");
		}
		else {
			System.out.println("dia invalido");
	}
	} 
}
