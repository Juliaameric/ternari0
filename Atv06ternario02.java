package lpa;

import java.util.Scanner;

public class Atv06ternario02 {

	public static void main(String[] args) {
    
      Scanner ler = new Scanner(System.in);
		
		int salario, tempo;
		System.out.println("digite seu salario");
		salario = ler.nextInt();
		
		System.out.println("digite seu tempo");
		tempo = ler.nextInt();
		
		double bonus1 = (salario*1.05);
		double bonus2 = (salario*1.07);
		
		switch (salario) {
		
		case 1: 
			System.out.println("o salario é"+bonus1);
			break;
		
		default:
			System.out.println("o salario é"+bonus2);
		}

	}

}
