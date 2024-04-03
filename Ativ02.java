package lpa;

import java.util.Scanner;

public class Ativ02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String turno;
		
		System.out.println("informe seu turno em que estuda: ");
		turno = ler.next();
	
		if (turno.equals("M")) {
			System.out.println("Bom Dia!");
		}
		else if (turno.equals("V")) {
			System.out.println("Boa tarde!");
		}
			
		else if (turno.equals("N")) {
				System.out.println("Boa noite!");
		}
		else {
			 System.out.println("valor invalido");
			}

	}

}
