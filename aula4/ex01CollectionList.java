package aticidades4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex01CollectionList {

	public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        Scanner leia = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " Informe uma cor: ");
            String cor = leia.nextLine();
            cores.add(cor);
        }

        System.out.println("\nCores na lista:");
        for (String cor : cores) {
            System.out.println(cor);
        } 
         Collections.sort(cores);   
            
         System.out.println("Cores de forma ordenada: ");
         for (String cor : cores) {
             System.out.println(cor);
         
        }
    }
}
