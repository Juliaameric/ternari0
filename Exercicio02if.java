package lpa;

import java.util.Scanner;

public class Exercicio02if {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int dia;
		
		System.out.println("informe um dia da semana (1-7)");
		dia = ler.nextInt();
		
		if (dia==1) {
			System.out.println("é domingo");
		}
		else if (dia==2) {
			System.out.println("é segunda");
		}
		else if (dia==3) {
			System.out.println("é terça");	
		}
		else if (dia==4) {
			System.out.println("é quarta");	
		}
		else if (dia==5) {
			System.out.println("é quinta");
		}
		else if (dia==6) {
			System.out.println("é sexta");
		}
		else if (dia ==7) {
			System.out.println("é sabado");
		}
		else {
			System.out.println("dia invalido");
		}
		ler.close ();
	}
	
}