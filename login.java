package atividade;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		String senha;

		System.out.println("Digite o Nome");
		nome = sc.nextLine();
		System.out.println("Digite a Senha");
		senha = sc.nextLine();

		if (nome.equals("Roger") && (senha.equals("123"))) {
			System.out.println("Login Feito Com Sucesso");
		} else
			System.out.println("Login Invalido");

		sc.close();

	}

}
