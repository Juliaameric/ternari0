package lpa;

public class atv02case {

	public static void main(String[] args) {

		System.out.println("informe o dia da semana");
		int dia = ler.nextInt();

		switch (dia) {
		
		case 1:
			System.out.println("o dia é domingo.");
			break;
		case 2:
			System.out.println("o dia é segunda.");
			break;	
		case 3:
			System.out.println("o dia é terça.");
			break;
		case 4:
			System.out.println("o dia é quarta.");
			break;
		case 5:
			System.out.println("o dia é quinta.");
			break;	
		case 6:
			System.out.println("o dia é sexta.");
			break;
		case 7:
			System.out.println("o dia é sabado.");
			break;
		default:
			System.out.println("dia invalido");
		}
	  }
	}

