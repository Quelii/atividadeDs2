package atividade;

import java.util.Scanner;

public class imparPar {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int n, num =0, pares = 0, impares = 0;
		
		System.out.println("Digite Um Número int e Positivo");
		while(num >=0) {
			
		num = sc.nextInt();
		
			if(num%2==0)
				pares ++;
			else
				impares++;
		}
		System.out.println("O total de numeros pares" + pares);
		System.out.println("impares"+impares);
	}

}
