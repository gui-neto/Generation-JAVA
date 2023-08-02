package atividades;

import java.util.Scanner;

public class atv4 {
	public static void main(String ags[]) {
	
	float nota1,nota2,nota3,nota4,media;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Informa Nota 1: ");
		nota1 = leia.nextFloat();
		
	System.out.println("Informe Nota 2: ");
		nota2 = leia.nextFloat();
		
	System.out.println("Informe Nota 3: ");
		nota3 = leia.nextFloat();
		
	System.out.println("Informe Nota 4: ");
		nota4 = leia.nextFloat();
	
	media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	System.out.println("A média é: "+media);
	
	
		
	}
}
