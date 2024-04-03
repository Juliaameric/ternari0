package lpa;

import java.util.Scanner;

public class Atv03mesemcase {

	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("informe os meses do ano");
		int mes = ler.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println(" o mes é janeiro");
			break;
		case 2:
			System.out.println("o mes é fevereiro");
			break;
		case 3:
			System.out.println("o mes é março");
			break;
		case 4:
			System.out.println(" o mes é abril");
			break;
		case 5:
			System.out.println(" o mes é maio");
			break;
		case 6: 
			System.out.println("o mes é junho");
			break;
		case 7:
			System.out.println("o mes é julho");
			break;
		case 8:
			System.out.println("o mes é agosto");
			break;
		case 9:
			System.out.println("o mes é setembro");
			break;
		case 10:
			System.out.println("o mes é outubro");
			break;
		case 11:
			System.out.println("o mes é novembro");
			break;
		case 12:
			System.out.println("o mes é dezembro");
			break;
			
		default:
			System.out.println("mes invalido");
			
		}
		

	}

}
