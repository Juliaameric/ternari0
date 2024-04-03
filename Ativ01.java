package lpa;
import java.util.Scanner;

public class Ativ01 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String login,senha, l, s;
		
		System.out.println("cadastre seu usuario: ");
		l = ler.next();
		System.out.println("cadastre sua senha: ");
		s = ler.next();
			
			System.out.println("informe o login: ");
			login = ler.next();
	
			System.out.println("informe a senha");
			senha = ler.next();
	
		if (login.equals(l)&& senha.equals(s)) {
			System.out.println("bem-vindo ao Sistema Senai");
		}
			
		else {
			 System.out.println("dados incorretos informe os dados novamente");
			}
		
	}

	

}
