package atividade;

import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
		
		float n1 = 0;
		float n2 = 0;
		int i = 0;
		float media = 0;
		float mediaturma =0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i = 1; i <=3; i++){
			
		System.out.printf("Aluno %d: \n",i);
		
		System.out.println("Digite a Primeira nota: ");
		n1 = sc.nextFloat();
		
		System.out.println("Digite a Segunda Nota: ");
		n2 = sc.nextFloat();
		
		media = (n1 + n2) / 2;
		System.out.printf("A média é %f\n",media);
		
		if(media > 6) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		mediaturma = media + mediaturma;
	}
		
		System.out.printf("%f É a média da Turma",mediaturma /3);
		
		
	}
		

}
