package lpa;

import java.util.Scanner;

public class exm02ternario {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int idade ;
		
		System.out.print("informe a idade");
		idade = ler.nextInt();
				
		String mensagem = idade >= 18 ? "maior de idade" : "menor de idade";
		System.out.println(mensagem); // "imprime maior de idade"
	

}
}