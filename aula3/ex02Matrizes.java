package atividades3;

public class ex02Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
	int somaDP = 0, somaDS = 0;
	
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
		System.out.println();
		}
		
		System.out.println("\nElementos da Diagonal principal: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j) {
					System.out.print(matriz[i][j]+ " ");
					somaDP += matriz[i][j];
				}
				
			}
		}
		
		System.out.println("\nElementos da Diagonal secundaria: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i+j-1 == 1) {
					System.out.print(matriz[i][j]+ " ");
					somaDS += matriz[i][j];
				}
				
			}
		}
		
		System.out.println("\nSoma de elementos da diagonal principal: "+somaDP);
		System.out.println("\nSoma de elementos da diagonal secundaria : "+somaDS);
	}
}
