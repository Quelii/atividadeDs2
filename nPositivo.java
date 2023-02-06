package atividade;

import java.util.Scanner;

public class nPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		int i = 0;
		int num;
		
		System.out.println("Digite um Número Inteiro Positivo");
		num = sc.nextInt();
		
		for (i=1; i<=num; i++){
			if(i %2 != 0){
				
				System.out.println(i +"");
			}
		}
	}

}
