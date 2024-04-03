package lpa;

import java.util.Scanner;

public class Atv05ternario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a;
		a = ler.nextDouble();
		String mensagem = a % 5 == 0 ? ("o numero" + a + " é multiplo de 5") : ("o numero " + a + " nao é multiplo de cinco");
		System.out.println(mensagem);
	}

}
