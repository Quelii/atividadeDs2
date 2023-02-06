package atividade;

import java.util.Scanner;


public class tabuada {

	public static void main(String[] args) {
		int num;
		int i = 5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Um Número");
		num = sc.nextInt();
		
		for(i = 0; i <= 10; i ++){
			
		System.out.println(num + " x " + i + " = " + num*i);
		
		
		}
		
	}

}
