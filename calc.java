package atividade;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float a;
		float b;
		float result;
		int i;
		//digitando valores
		System.out.println("Digite o Primeiro Valor: ");
		a = sc.nextInt();
		System.out.println("Digite o Segundo Valor: ");
		b = sc.nextInt();

		System.out.println("Escolha a Operação: ");
		System.out.println(" 1 para Adição: ");
		System.out.println(" 2 para Subitração: ");
		System.out.println(" 3 para Mutiplicação: ");
		System.out.println(" 4 para Divisão");
		
		i = sc.nextInt();
		switch(i) {
		
		case 1:{
			System.out.printf("O valor da Adição é %.2f + %.2f = %.2f",a,b,a+b);
			break;
		}
		case 2:{
			System.out.printf("O valor da Subitração é %.2f - %.2f = %.2f",a,b,a-b);
			break;
		}
		case 3:{
			System.out.printf("O valor da Mutiplicação é %.2f * %.2f = %.2f",a,b,a*b);
			break;
		}
		case 4:{
			System.out.printf("O valor da Divisão é %.2f - %.2f = %.2f",a,b,a/b);
			break;
			
		}
		default: {
			System.out.println("Opção invalida");
			break;
		}
		}
	}

}
