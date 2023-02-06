package atividade;

import java.util.Scanner;

public class Condicao {

	public static void main(String[] args) {
		int num;
		Scanner sc =new Scanner(System.in);

		do {
		   System.out.println("Digite um número:");
		   num = sc.nextInt();
		} while (num < 1 || num > 5);
		System.out.println("Programa encerrado");
	}

}
