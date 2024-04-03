package lpa;

import java.util.Scanner;

public class exercicio01if {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int nota1, nota2, nota3, nota4, media;
		
		System.out.println("primeiro nota");
		nota1= ler.nextInt();
		
		System.out.println("segunda nota");
		nota2= ler.nextInt();
		
		System.out.println("terceira nota");
		nota3= ler.nextInt();
		
		System.out.println("quarta nota");
		nota4= ler.nextInt();
		
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("valor da media é: "+ media);
		
		if (media >=6) {
		System.out.println("aluno aprovado");
		}
		
		else if (media < 4) {
		 System.out.println("reprovado");
		}
		
		else {
	    System.out.println("recuperaçao");
		}
	}

}
