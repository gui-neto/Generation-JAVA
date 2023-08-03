package atividades2;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int maior21 = 0;
		int maior50 = 0; 
		int idade = 0;
		
		while(true){	
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		if(idade < 21 && idade > 0) {
			maior21++;
		}else if(idade > 50) {
			maior50++;
		}else if(idade < 0) {
			break;
		}
		
		}
		
		System.out.println("Total de pessoas menores 21 anos: "+maior21);
		System.out.println("Total de pessoas maiores de 50 anos: "+maior50);
	}

}
