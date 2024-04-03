package lpa;

import java.util.Scanner;

public class Exercicio04ifelse {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int mes;

		System.out.println("informe os meses do ano");
		mes = ler.nextInt();
		
		if (mes ==1) {
			System.out.println("é janeiro");
		}
		
		else if (mes ==2) {
			System.out.println("é fevereiro");
		}
		
		else if (mes ==3) {
			System.out.println("é março");	
		}
		
		else if (mes ==4) {
			System.out.println("é abril");	
		}
		
		else if (mes ==5) {
			System.out.println("é maio");
		}
		
		else if (mes ==6) {
			System.out.println("é junho");
		}
		else if (mes ==7) {
			System.out.println("é julho");
		}
		
		else if (mes ==8) {
			System.out.println("é agosto");
		}
		
		else if (mes ==9) {
			System.out.println("é setembro");
		}
		
		else if (mes ==10) {
			System.out.println("é outubro");
		}
		
		else if (mes ==11) {
			System.out.println("é novembro");
		}
		
		else if (mes ==12) {
			System.out.println("é dezembro");
		}
		
		else {
			System.out.println("mes invalido");
		}
		
		ler.close ();

	}

}
