package lpa;

import java.util.Scanner;

public class Exemploif02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero;
		
		System.out.println("informe o numero: ");
		numero= ler.nextInt();
		
		if (numero > 0) {
			System.out.println("ele é positivo");
		}
		else if (numero == 0) {
			System.out.println("zero");
		}
		
		else {
			System.out.println("ele é negativo");
		}
		ler.close();
	}	
}
