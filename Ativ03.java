package lpa;

import java.util.Scanner;

public class Ativ03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("informe o primeiro valor");
		n1= ler.nextInt();
		
		System.out.println("informe o segundo valor");
		n2= ler.nextInt();
		
		System.out.println("informe o terceira valor");
		n3= ler.nextInt();
		
		if ((n1>n2)&&(n1>n3)){
			System.out.println("o "+n1+" é o maior numero entre eles: ");	
		}
		else if (n2>n3) {
			System.out.println("o "+n2+" é o maior numerro entre eles");
		}
		else if ((n1==n2)&&(n2==n3)) {
			System.out.println(" todos sao iguais");
		}
		else {
			System.out.println("o "+n3+" éo menor numerro entre eles");
		}

			if ((n1<n2)&&(n1<n3)){
				System.out.println("o "+n1+" é o menor numero entre eles: ");	
			}
			else if (n2<n3) {
				System.out.println("o "+n2+" é o menor numerro entre eles");
			}
			else if ((n1==n2)&&(n2==n3)) {
				System.out.println(" todos sao iguais");
			}
			else {
				System.out.println("o "+n3+" éo menor numerro entre eles");
			}
		}
	}	
	


