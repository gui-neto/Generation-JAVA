package atividades2;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
	
		int impares = 0, pares = 0, numero;
		
		for(int n1 = 1; n1 < 10; n1++) {
			System.out.println("Escreva o numero: "+ n1);
			numero = leia.nextInt();
			
		if (numero % 2 == 0) {
			pares++;
		}else {
			impares++;
		}

		}
		
		System.out.println("Total de numeros pares: "+pares);
		System.out.println("Total de numeros ímpares: "+impares);
	}

}
