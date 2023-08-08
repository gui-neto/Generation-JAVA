package atividades3;

import java.util.Scanner;

public class ex01vetores {

	public static void main(String[] args) {
	
		int [] vetor = {2,5,1,3,4,9,7,8,10,6};
		int numero = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]); {
			}
		}
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite o numero que deseja encontrar: ");
			int nd = leia.nextInt();
			
		int posicao = procurar(vetor, nd);
		
		if (posicao != -1) {
			System.out.println("\nO numero" +nd+ "está localizado na posição "+posicao);
		} else {
			System.out.println("\nNumero invalido!");
		}
		
	}

	private static int procurar(int[] vetor, int nd) {
		
		for(int x = 0; x < 10; x++) {
			if (vetor[x] == nd) {
				return x;
			}
		}
		return -1;
		
		
		
	}
}
