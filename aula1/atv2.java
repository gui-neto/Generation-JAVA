package atividades;

import java.util.Scanner;

public class atv2 {
	public static void main(String args[]) {
		int n1,n2,n3,n4;
		int impar,par;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
			n1 = (int) leia.nextFloat(); 
			
		System.out.println("Digite outro número: ");
			n2 = (int) leia.nextFloat();
			
		System.out.println("Digite mais um número: ");
			n3 = (int) leia.nextFloat();
			
		System.out.println("Digite o último número: ");
			n4 = (int) leia.nextFloat();
			
		if(n1 % 2 ==0) {
			System.out.println(+n1+" é um número par.");
		} else {
			System.out.println(+n1+" é um número impar.");
		}
		
		if(n2 % 2 ==0) {
			System.out.println(+n2+" é um número par.");
		} else {
			System.out.println(+n2+" é um número impar.");
		}
		
		if(n3 % 2 ==0) {
			System.out.println(+n3+" é um número par.");
		} else {
			System.out.println(+n3+" é um número impar.");
		}
		
		if(n4 % 2 ==0) {
			System.out.println(+n4+" é um número par.");
		} else {
			System.out.println(+n4+" é um número impar.");
			
		if (n1 > 0) {
			System.out.println(+n1+" o numero é positivo.");
		}else if (n1 < 0) {
			System.out.println(+n1+" o numero é negativo.");
		}
		
		if (n2 > 0) {
			System.out.println(+n2+" o numero é positivo.");
		}else if (n2 < 0) {
			System.out.println(+n2+" o numero é negativo.");
		}
		
		if (n3 > 0) {
			System.out.println(+n3+" o numero é positivo.");
		}else if (n3 < 0) {
			System.out.println(+n3+" o numero é negativo.");
		}
		if (n4 > 0) {
			System.out.println(+n4+" o numero é positivo.");
		}else if (n4 < 0) {
			System.out.println(+n4+" o numero é negativo.");
		}
		}
	}
}
