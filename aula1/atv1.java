package atividades;

import java.util.Scanner;

public class atv1 {
	public static void main(String args[]) 
	{
		int valor1,valor2,valor3;
		int soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Inofrme o valor de A: ");
			valor1 = (int) leia.nextFloat();
			
		System.out.println("Inofrme o valor de B: ");
			valor2 = (int) leia.nextFloat();
			
		System.out.println("Inofrme o valor de C: ");
			valor3 = (int) leia.nextFloat();
			
		soma = valor1 + valor2 ;
		if(soma > valor3){
			System.out.println("a soma de (A): "+valor1+" + (B): "+valor2+" é maior que (C).: "+valor3);
		}else if(soma < valor3) {
			System.out.println("a soma de (A): "+valor1+" + (B): "+valor2+" é menor que (C): "+valor3);
		}else {
			System.out.println("a soma de (A): "+valor1+" + (B): "+valor2+" é igual a (C): "+valor3);
		}
 	}
}
