package aticidades4;

import java.util.HashSet;
import java.util.Scanner;

public class ex02ClasseIterator {
    public static void main(String[] args) {

        int lista[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        Scanner leia = new Scanner(System.in);

        System.out.println("Valores na lista:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.print("\nDigite qual numero você deseja encontrar: ");
        int numeroDesejado = leia.nextInt();
        
        boolean encontrado = false; 

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == numeroDesejado) {
                encontrado = true; 
                System.out.println("Numero " + numeroDesejado + " encontrado na posição " + i); 
                break;
            }
        }
        

    }
}

