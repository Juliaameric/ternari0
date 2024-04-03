package lpa;

import java.util.Scanner;

public class Atv04ternario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	double nota1,nota2,nota3,nota4,media;
		
		System.out.println("informe a primeira nota");
		nota1= ler.nextDouble();
		
		System.out.println("informe a segunda nota");
		nota2= ler.nextDouble();
		
		System.out.println("informe a terceira nota");
		nota3= ler.nextDouble();
		
		System.out.println("informe a quarta nota");
		nota4= ler.nextDouble();
 
		media = (nota1+nota2+nota3+nota4)/4;
		
		String mensagem = media >= 6 ? "aprovado" : "reprovado";
		System.out.println(mensagem); 
	}
}
